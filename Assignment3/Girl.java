package Assignment3;

public class Girl extends Person4{
    private String gender; 
    private double shoeSize; 


    // Default Constructor
    public Girl(){
        shoeSize = 0;
        gender = "Female";
        }


    // Parameterized Constructor
    public Girl(double initialShoeSize, String initialGender, double initialHeight, int initialAge, String initialName, double intiialWeight){
        super(initialHeight, initialAge,initialName, intiialWeight);
        setShoeSize(initialShoeSize);
        setGender(initialGender);
    
    }
    

    // Set methods
    public void setShoeSize(double newShoeSize) {
        shoeSize = newShoeSize;
    }

    public void setGender(String newGender) {
        gender = newGender;
    }
    

    // Get methods
    public double getShoeSize() {
        return shoeSize;
    }


    public String getGender() {
        return gender;
    }


    public boolean isSameAge(Person4 otherPerson){
        return this.getAge() == otherPerson.getAge();
    }
    

    
}
