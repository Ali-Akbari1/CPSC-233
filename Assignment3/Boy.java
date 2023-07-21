package Assignment3;

public class Boy extends Person{
    private String gender;
    private double shoeSize;

    // Default Constructor
    public Boy(){
        shoeSize = 0;
        gender = "Male";
    }

    // Parameterized Constructor
    public Boy(double initialShoeSize, String initialGender, int initialHeight, int initialAge, String initialName, int intiialWeight){
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

    public boolean isSameAge(Person otherPerson){
        return this.getAge() == otherPerson.getAge();
    }

}
