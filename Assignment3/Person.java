package Assignment3;

// Person Class
public class Person {

    // Instance variables
    private int age;
    private String name;
    private double height;
    private double weight;

    // Default Constructor
    public Person() {
        age = 0;
        name = "No name yet ";
        height = 0.0;
        weight = 0.0;
    }

    // Parameterized Constructor
    public Person(double initialHeight, int initialAge, String initialName, double initialWeight) {
        height = initialHeight;
        weight = initialWeight;
        age = initialAge;
        name = initialName;
    }

    // Set Methods
    public void setHeight(double newHeight) {
        height = newHeight;
    }

    public void setWeight(double newWeight) {
        weight = newWeight;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public void setName(String newName) {
        name = newName;
    }

    // Get Methods
    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    // Method to calculate a persons BMI using height and weight
    public double calculateBMI() {
        height = getHeight();
        weight = getWeight();

        double bmi = 0.0;

        bmi = weight / (height * height);

        return bmi;
    }

    // Method to check if a person is the same age as another person
    public boolean isSameAge(Person otherPerson) {
        return this.age == otherPerson.getAge();
    }

    // Method to display the objects
    public void writeOutput(){
        System.out.println("Name: " + name + ","+ " Age: " + age + "," + " Height: " + height + "m," + " Weight: " + weight + "kg" +
                            " BMI of " + name + " is: " + calculateBMI());
    }


    // Method to show method overriding
    public void introduceYourself(){
        System.out.println("I am just a person, I don't know what chromosomes I have yet");
    }

}