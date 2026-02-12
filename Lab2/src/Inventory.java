import java.util.LinkedList;
import java.util.List;

public class Inventory {
	private List<Guitar> guitarList;

	public Inventory() {
		guitarList = new LinkedList<>();
	}

	public void addGuitar(String serialNumber, double price, Builder builder,
			String model, Type type, Wood backWood, Wood topWood) {
		// Match GuitarSpec constructor: (builder, model, type, topWood, backWood)
		GuitarSpec spec = new GuitarSpec(builder, model, type, topWood, backWood);
		Guitar guitar = new Guitar(serialNumber, price, spec);
		guitarList.add(guitar);
	}

	public List<Guitar> search(GuitarSpec searchSpec) {
		List<Guitar> matches = new LinkedList<>();
		for (Guitar guitar : guitarList) {
			if (guitar.getSpec().matches(searchSpec)) {
				matches.add(guitar);
			}
		}
		return matches;
	}

	public void printInventory() {
		System.out.println("\n###### Inventory Start ######");
		for (Guitar item : guitarList) {
			System.out.println(item);
		}
		System.out.println("###### Inventory End ######\n");
	}

	public void printSearchResults(List<Guitar> results) {
		if (results.isEmpty()) {
			System.out.println("Sorry, we found no matches.");
			return;
		}
		System.out.println("You might like these guitars:");
		for (Guitar guitar : results) {
			GuitarSpec spec = guitar.getSpec();
			System.out.println("  We have a " + spec.getBuilder() + " " + spec.getModel() +
					" " + spec.getType() + " guitar for $" + guitar.getPrice());
		}
	}

	public static void main(String[] args) {
		Inventory inv = new Inventory();

		// Adding Guitars
		inv.addGuitar("X1X 0Y0", 679.99, Builder.FENDER, "AP88",
				Type.ELECTRIC, Wood.MAHOGANY, Wood.CANADIAN_MAPLE);
		inv.addGuitar("X1X 0Y1", 788.99, Builder.FENDER, "AV123",
				Type.ELECTRIC, Wood.MAHOGANY, Wood.BRAZILIAN_ROSEWOOD);
		inv.addGuitar("X2P 0Z2", 3088.5, Builder.MARTIN, "D-28",
				Type.ACOUSTIC, Wood.BRAZILIAN_ROSEWOOD, Wood.SITKA);

		inv.printInventory();

		// Searching: Alex wants a Fender Electric with Mahogany Back
		// GuitarSpec(builder, model, type, topWood, backWood)
		GuitarSpec whatAlexLikes = new GuitarSpec(Builder.FENDER, null,
				Type.ELECTRIC, null, Wood.MAHOGANY);

		inv.printSearchResults(inv.search(whatAlexLikes));
	}
}
