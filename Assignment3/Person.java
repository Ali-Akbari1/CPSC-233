package Assignment3;

public class Person {

    //Instance variables
    private double gpa;
    private int age;
    private String name;

    // Constructor
    public Person(double initialGPA, int initialAge, String InitialName){
        setGPA(initialGPA);
        setAge(initialAge);
        setName(InitialName);

    }


    // Set Methods
    public void setGPA(double newGPA){
        gpa = newGPA;

    }

    public void setAge(int newAge){
        age = newAge;
    }

    public void setName(String newName){
        name = newName;

    }

    // Get Methods
    public double getGPA(){
        return gpa;

    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public String getStudentGPA(){
        gpa = getGPA();
         
    }


    public class Boy extends Person{

    }
    public class Girl extends Person{

    }
}