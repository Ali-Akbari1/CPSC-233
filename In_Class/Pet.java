package In_Class;

public class Pet {

    // Fields or Data member or Instance variable or characteristics or attributes
    private String name;
    private int age;

    public Pet(){
        this("No name yet", 0);

    }
    

    public Pet(String initialName, int initialAge){
        set(initialName, initialAge);
    }

    public Pet(String initialName){
        this(initialName,0); // call a constructor that takes a String and an Integer
    }

    public Pet(int initialAge){
        this("No name yet", initialAge);
    }

    public void set(String newName, int newAge){
        name = newName;
        age = newAge;

    }

    public String getName(){
        return name;
    }


    public int getAge(){
        return age;
    }

    public static void main(String[] args){
        Pet p1 = new Pet();
        System.out.println(p1.getName());
        System.out.println(p1.getAge());
        Pet p2 = new Pet("Tommy");
        System.out.println(p2.getName());
    }

}
