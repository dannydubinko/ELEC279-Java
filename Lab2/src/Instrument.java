public abstract class Instrument {
    private String serialNumber;
    private double price;
    private InstrumentSpec iSpec;

    public Instrument(String serialNumber, double price, InstrumentSpec iSpec) {
        setSerialNumber(serialNumber);
        setPrice(price);
        this.iSpec = iSpec;
    }

    public String getSerialNumber() {
        return this.serialNumber;
    }

    public double getPrice() {
        return this.price;
    }

    public InstrumentSpec getSpec() {
        return this.iSpec;
    }

    private void setSerialNumber(String serialNo) {
        if (serialNo == null || serialNo.isEmpty()) {
            throw new IllegalArgumentException("Serial number cannot be null or empty.");
        } else {
            this.serialNumber = serialNo;
        }
    }

    public void setPrice(double priceSet) {
        if (priceSet < 0) {
            throw new IllegalArgumentException("A negative price cannot be assigned");
        } else {
            this.price = priceSet;
        }
    }

}
