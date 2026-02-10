
public class Inventory {
	private Guitar guitarArray[];
	public Inventory() {
		guitarArray = new Guitar[10];
	}
	
	public void addGuitar(String serialNo, double priceSet, String builder, String model, 
			String type, String topWood, String backWood) 
	{
		Guitar guitarObj = new Guitar(serialNo, priceSet, builder, model, type, topWood, backWood);

		
		int findSpace = insertGuitar();
		if(findSpace >=0 && findSpace<guitarArray.length) {
			/*
			 * If insertGuitar() returns a valid index, then
			 * you will insert the guitarObj in the guitarArray
			 * */
			guitarArray[findSpace] = guitarObj;

		}
	}
	
	public int insertGuitar() {
		
		/*
		 * This method returns the index of the smallest index of array which is empty 
		 * You have to insert new guitar objects into the Array.
		 * But to insert into the Array, you have to first find out an empty
		 * space, also need to check that Array has not been full.
		*/
		
		for (int i=0; i < guitarArray.length; i++) {
			if (guitarArray[i] == null) {
				return i;
			}
		}
		System.out.println("The Inventroy is Full. Cannot add Guitar");
		return -1;	
	}

	public void printInventory(){
		System.out.println("###### Inventory Start ######");
		/*
		 * Print the whole inventory
		 * */
		for (Guitar item : guitarArray){
			if (item != null) {
				System.out.println(item.getSerialNumber() + " " + item.getPrice() + " "+ item.getModel() + " "+
					item.getBuilder()+" "+ item.getType()+ " " + item.getTopWood()+ " " + item.getBackWood() + "\n");
			}
		}
		System.out.println("###### Inventory End ######");
	}
	
	public Guitar searchForGuitar(Guitar key) {
		Guitar foundItem = null;
		/*
		 * Search method to find guitar through all the guitar properties.
		 * */
		for (Guitar guitar : guitarArray) {
			if (guitar.getBuilder().equalsIgnoreCase(key.getBuilder())){
				if (guitar.getModel().equalsIgnoreCase(key.getModel())){
					if (guitar.getType().equalsIgnoreCase(key.getType())){
						if (guitar.getTopWood().equalsIgnoreCase(key.getTopWood())){
							if (guitar.getBackWood().equalsIgnoreCase(key.getBackWood())){
								foundItem = guitar;
								break;
							}
						}	
					}
				}
			}
		}

		return foundItem;
	}
	
	public void findGuitar(Guitar clientWants) {
		//Here we are searching for a guitar.
		Guitar item = searchForGuitar(clientWants);
		
		//We print what our search method returns
		if( item == null) {
			System.out.println("Sorry We dont have anything for you");
		}else {
			System.out.print("Here's what we got: ");
			System.out.println(item.getSerialNumber() + " " + item.getPrice() + " "+ item.getModel() + " "+
					item.getBuilder()+" "+ item.getType()+ " " + item.getTopWood()+ " " + item.getBackWood());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inventory invRef = new Inventory();
		System.out.println("Inventory Size: " + invRef.guitarArray.length); //Print Array Size
		
		invRef.addGuitar("X7X 0Y8", 208.99, "FENDER", "AXp", "ELECTRIC", "ALDER", "ALDER");
		invRef.addGuitar("PCQ 288", 208.99, "FENDER", "AP88", "ELECTRIC", "MAHOGONY", "CANADIAN_MAPLE");
		invRef.addGuitar("X78 9V5", 208.99, "GIBSON", "Les Paul Standard", "ELECTRIC", "MAHOGONY", "CANADIAN_MAPLE");
		invRef.addGuitar("X2P 0Z2", 3088.5, "MARTIN", "D-28", "ACOUSTIC", "BRAZILIAN_ROSEWOOD", "SITKA");
		invRef.printInventory();
		//Create a search by Client Specification
		Guitar whatClientLikes = new Guitar("GIBSON", "Les Paul Standard", "ELECTRIC", "MAHOGONY", "CANADIAN_MAPLE");
		invRef.findGuitar(whatClientLikes);
	}

}
