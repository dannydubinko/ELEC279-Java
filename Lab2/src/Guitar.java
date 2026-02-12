public class Guitar {
	private String serialNumber;
	private double price;
	private GuitarSpec spec; // This now holds builder, model, type, etc.

	// This is your primary constructor now
	public Guitar(String serialNumber, double price, GuitarSpec spec) {
		// Initialize with defaults in case setters fail
		this.serialNumber = "Unknown";
		this.price = 0.0;

		this.spec = spec;
		setSerialNumber(serialNumber);
		setPrice(price);
	}

	public GuitarSpec getSpec() {
		return spec;
	}

	private void setSerialNumber(String serialNo) {
		if (serialNo == null || serialNo.isEmpty()) {
			System.out.println("SerialNo currently has no value.");
		} else {
			this.serialNumber = serialNo;
		}
	}

	public void setPrice(double priceSet) {
		if (priceSet < 0) {
			// Note: we use spec.getModel() here because the local field is gone
			System.out.println("A negative price cannot be assigned to Guitar Model: " + spec.getModel());
		} else {
			this.price = priceSet;
		}
	}

	public String getSerialNumber() {
		return this.serialNumber;
	}

	public double getPrice() {
		return price;
	}

	// Delegation Methods:
	// If you still need getBuilder() directly on Guitar,
	// you ask the spec for it. This is called "delegation."

	public Builder getBuilder() {
		return spec.getBuilder();
	}

	public String getModel() {
		return spec.getModel();
	}

	// Add a toString so your printInventory() actually shows data!
	@Override
	public String toString() {
		return String.format("%-10s %-8.2f %s", serialNumber, price, spec.toString());
	}
}
