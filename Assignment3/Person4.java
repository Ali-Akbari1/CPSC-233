package Assignment3;

public class Person4 {

    //Instance variables
    private int age;
    private String name;
    private double height;
    private double weight; 

    // Default Constructor
    public Person4(){
        
        age = 0;
        name = "No name yet ";
    }

    // Parameterized Constructor
    public Person4(double initialHeight, int initialAge, String initialName, double intiialWeight){
        setHeight(initialHeight);
        setWeight(intiialWeight);
        setAge(initialAge);
        setName(initialName);

    }


    // Set Methods
    public void setHeight(double newHeight){
        height = newHeight;
    

    }

    public void setWeight(double newWeight){
        weight = newWeight;
    

    }

    public void setAge(int newAge){
        age = newAge;
    }

    public void setName(String newName){
        name = newName;

    }

    // Get Methods
    public double getHeight(){
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

    public boolean isSameAge(Person4 otherPerson){
        return this.age == otherPerson.getAge();
    }
}