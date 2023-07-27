package Assignment3;

// Boy Class
public class Boy extends Person {
    private String gender;
    private double shoeSize;

    // Default Constructor
    public Boy() {
        super();
        shoeSize = 0;
        gender = "Male";
    }

    // Parameterized Constructor
    public Boy(double initialShoeSize, String initialGender, double initialHeight, int initialAge, String initialName, double initialWeight) {
        super(initialHeight, initialAge, initialName, initialWeight);
        shoeSize = initialShoeSize;
        gender = initialGender;
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

    // Method to check if a person is the same age as another person
    public boolean isSameAge(Person otherPerson) {
        return this.getAge() == otherPerson.getAge();
    }

    // Method to display the objects
    public void writeOutput(){
        super.writeOutput();
        System.out.println("Gender: " + gender + "," + " Shoe Size: " + shoeSize);

    }

    // Method to show method overriding
    public void introduceYourself(){
        System.out.println("Hey I have an XY chromosome");
    }

}
