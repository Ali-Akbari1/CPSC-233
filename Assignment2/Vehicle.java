// Ali Akbari ID: 30171539


package Assignment2;


public class Vehicle{
	
	// Instance variables
	private String make;
	private String model;
    private int mileage;

	// Constructor
	public Vehicle (String initialMake, String initialModel, int InitialMileage){
		setMake(initialMake);
		setModel(initialModel);
		setMileage(InitialMileage);
	}

	// Copy constructor
	public Vehicle(Vehicle vehicleToCopy){
		this(vehicleToCopy.make, vehicleToCopy.model, vehicleToCopy.mileage);
	}

	// Set Methods
	public void setMake(String newMake){
		make = newMake;

	}

	public void setModel(String newModel){
		model = newModel;

	}

	public void setMileage(int newMileage){
		mileage = newMileage;

	}

	// Get Methods
	public String getMake(){
		return make;
	}
	
	public String getModel(){
		return model;
	}
	
	public int getMileage(){
		// If the mileage is over 25, or less than 0 set mileage to 0
		if (mileage > 25 || mileage < 0){
			return mileage = 0;
		}
		return mileage;

	}

	// Fuel Efficiency Method
	public String getFuelEfficiencyCategory(){
		mileage = getMileage();
		if (mileage > 15){
			return "Best";
		}
		else if (mileage <= 15 && mileage >= 8){
			return "Average";
		}
		else{
			return "Worst";
		}
	}

	// complete the class definition
	// Do not change anything in the main
	// if you implemented correctly, your code should work properly without any error
	// You should also have the output what you see in the comments of each outputline below
	
	public static void main(String[] args){
		Vehicle v = new Vehicle("Fiat", "City", 0);
		v.setMileage(20);
		System.out.println("Efficiency for mileage 20 is " + v.getFuelEfficiencyCategory()); // best
		v.setMileage(7);
		System.out.println("Efficiency for mileage 7 is " +v.getFuelEfficiencyCategory());    // worst
		v.setMileage(13);
		System.out.println("Efficiency for mileage 13 is " +v.getFuelEfficiencyCategory());    // average
		Vehicle v2 = new Vehicle("Honda", "CR-V", 30);
		System.out.println("Maker is:  " +v2.getMake()); // Honda
		System.out.println("Model is:  " +v2.getModel()); // CR-V
		System.out.println("Mileage is:  " +v2.getMileage()); // 0
		
 
		Vehicle v1 = new Vehicle("Toyota", "Corolla", 10);
		Vehicle v3 = new Vehicle(v1);
		
		System.out.println("Testin copy constructor make " + v3.getMake()); // Toyota
		System.out.println("Testin copy constructor model " + v3.getModel()); // Corolla
		System.out.println("Testin copy constructor mileage " + v3.getMileage()); // 10

		v3.setModel("Camry");
		System.out.println("Testin copy constructor model " + v3.getModel()); // Camry
		System.out.println("Testin copy constructor model " + v1.getModel()); // Corolla
		
		
	}
}