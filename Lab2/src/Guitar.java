
public class Guitar {
	private String serialNumber; 
	private double price;
	private String builder; 
	private String model; 
	private String type;
	private String backWood;
	private String topWood;
	
	public Guitar(String builder, String model, 
			String type, String topWood, String backWood){
		this.serialNumber="";
		this.price = 0.0;
		
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.topWood = topWood;
		this.backWood = backWood;
	}
	
	public Guitar(String serialNo, double priceSet, String builder, String model, 
							String type, String topWood, String backWood) {
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.topWood = topWood;
		this.backWood = backWood;
		
		setSerialNumber(serialNo);
		setPrice(priceSet);
	}
	
	private void setSerialNumber(String serialNo) {
		if (serialNo == null || serialNo.isEmpty()) {
			System.out.println("SerialNo currently has no value.");
		} else {
			this.serialNumber = serialNo;
		}
	}
	private void setPrice(double priceSet){
		if (priceSet < 0) {
			System.out.println("A negative price cannot be assigned to Guitar Model: " + this.model);
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
	public String getBuilder() {
		return builder;
	}
	public String getModel() {
		return model;
	}
	public String getType() {
		return type;
	}
	public String getTopWood() {
		return topWood;
	}
	public String getBackWood() {
		return backWood;
	}
	
	
}
