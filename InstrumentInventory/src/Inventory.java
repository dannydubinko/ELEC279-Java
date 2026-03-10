import java.util.LinkedList;
import java.util.List;

public class Inventory {
	private List<Instrument> instrumentList;

	public Inventory() {
		instrumentList = new LinkedList<>();
	}

	public void addInstrument(String serialNumber, double price, InstrumentSpec spec) {
		if (spec instanceof GuitarSpec) {
			Guitar guitar = new Guitar(serialNumber, price, (GuitarSpec) spec);
			instrumentList.add(guitar);
		} else if (spec instanceof MandolinSpec) {
			Mandolin mandolin = new Mandolin(serialNumber, price, (MandolinSpec) spec);
			instrumentList.add(mandolin);
		} else {
			throw new IllegalArgumentException("Unsupported instrument spec type, cannot add this instrument");
		}
	}

	public List<Guitar> search(GuitarSpec searchSpec) {
		List<Guitar> guitarList = new LinkedList<>();

		for (Instrument instrument : instrumentList) {
			if (instrument instanceof Guitar) {
				Guitar guitar = (Guitar) instrument;
				if (guitar.getSpec().matches(searchSpec)) {
					guitarList.add(guitar);
				}
			}
		}
		return guitarList;
	}

	public List<Mandolin> search(MandolinSpec searchSpec) {
		List<Mandolin> mandolinList = new LinkedList<>();

		for (Instrument instrument : instrumentList) {
			if (instrument instanceof Mandolin) {
				Mandolin mandolin = (Mandolin) instrument;
				if (mandolin.getSpec().matches(searchSpec)) {
					mandolinList.add(mandolin);
				}
			}
		}
		return mandolinList;
	}

	public void printInventory() {
		System.out.println("\n###### Inventory Start ######");
		for (Instrument item : instrumentList) {
			System.out.println(" " + item.getSpec().toString());
		}
		System.out.println("###### Inventory End ######\n");
	}

}
