package Assignment3;

public class Person {

    //Instance variables
   // private double gpa;
    private int age;
    private String name;
    private int height;
    private double weight; 

    // Default Constructor
    public Person(){
        
        age = 0;
        name = "No name yet ";
    }

    // Parameterized Constructor
    public Person(int initialHeight, int initialAge, String initialName, int intiialWeight){
        setHeight(initialHeight);
        setWeight(intiialWeight);
        setAge(initialAge);
        setName(initialName);

    }


    // Set Methods
    public void setHeight(int newHeight){
        height = newHeight;
    

    }

    public void setWeight(int newWeight){
        weight = newWeight;
    

    }

    public void setAge(int newAge){
        age = newAge;
    }

    public void setName(String newName){
        name = newName;

    }

    // Get Methods
    public int getHeight(){
        return height;
    

    }

    public double getWeight(){
        return weight;
    

    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public double calculateBMI(){
        height = getHeight();
        weight = getWeight();

        double bmi = 0.0;

        bmi = weight / (height * height);

        return bmi;
    }

    public boolean isSameAge(Person otherPerson){
        return this.age == otherPerson.getAge();
    }
}