package In_Class;

//Example of an Immutable Class

public final class Car
{
    private final String name;
    private final int id;
	private final int noOfWheels;
    
	public Car(String aName, int anID, int aWheels)
    {
        this.name = aName;
        this.id = anID;
		this.noOfWheels = aWheels;
    }

	public Car(Car oldCar)
    {
		this.name = oldCar.getName();
		this.id = oldCar.getID();
		this.noOfWheels = oldCar.getWheels();
	}
    
//    public void setName(String aName) { this.name = aName; }
    public String getName() { return name; }
    
//	public void setID(int newID) { this.id = newID; }
	
	public int getID() { return id; }
    
//	public void setWheels(int aWheels) { this.noOfWheels = aWheels; }
    public int getWheels() { return noOfWheels; }
	
	public String toString() { return name + " " + id + " " + noOfWheels; }

	public static void main (String[] args){
		
		Car myCar = new Car("Honda", 2345, 4);
	 //   myCar.setID(100);
		System.out.println(myCar.toString());
		
	//	Car myCar1 = new Car("Corolla", 7890, 4);
	//	System.out.println(myCar1.toString());
	
	}
}








