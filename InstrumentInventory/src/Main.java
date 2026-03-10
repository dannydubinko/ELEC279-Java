import java.util.List;

public class Main {

	public void printMatchingMandolin(List<Mandolin> mandolinList) {
		if (mandolinList.isEmpty()) {
			System.out.println("Sorry, we have no mandolins available.");
			return;
		}
		System.out.println("You might like the following Mandolins:");
		for (Mandolin mandolin : mandolinList) {
			MandolinSpec spec = (MandolinSpec) mandolin.getSpec();
			System.out.println(spec.toString());
		}
		System.out.println(" ");
	}

	public void printMatchingGuitar(List<Guitar> guitarList) {
		if (guitarList.isEmpty()) {
			System.out.println("Sorry, we have no guitars available.");
			return;
		}
		System.out.println("You might like the following Guitars:");
		for (Guitar guitar : guitarList) {
			GuitarSpec spec = (GuitarSpec) guitar.getSpec();
			System.out.println(spec.toString());
		}
		System.out.println(" ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inventory invObj = new Inventory();

		GuitarSpec guitarSpec = new GuitarSpec(Builder.FENDER, "AXp", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 6);
		invObj.addInstrument("X7X 0Y8", 208.99, guitarSpec);

		guitarSpec = new GuitarSpec(Builder.FENDER, "AP88", Type.ELECTRIC, Wood.MAHOGANY, Wood.CANADIAN_MAPLE, 12);
		invObj.addInstrument("X1X 0Y0", 679.99, guitarSpec);

		MandolinSpec mandSpec = new MandolinSpec(Builder.MARTIN, "D-28", Type.ACOUSTIC,
				Wood.BRAZILIAN_ROSEWOOD, Wood.SITKA, Style.A);
		invObj.addInstrument("X2P 0Z2", 388.5, mandSpec);

		mandSpec = new MandolinSpec(Builder.GIBSON, "Les Paul Standard", Type.ELECTRIC, Wood.MAHOGANY,
				Wood.CANADIAN_MAPLE, Style.B);
		invObj.addInstrument("K7C 0Y8", 607.90, mandSpec);

		invObj.printInventory();

		Main main = new Main();
		MandolinSpec searchedMandolin = new MandolinSpec(Builder.GIBSON, "Les Paul Standard", Type.ELECTRIC,
				Wood.MAHOGANY, Wood.CANADIAN_MAPLE, Style.B);
		main.printMatchingMandolin(invObj.search(searchedMandolin));

		GuitarSpec searchedGuitar = new GuitarSpec(Builder.FENDER, "AXp", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 6);
		main.printMatchingGuitar(invObj.search(searchedGuitar));
	}
}
