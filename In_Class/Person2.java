package In_Class;

public class Person2 {
    private String name;

    public Person2(){
        name = "No name initiated ";
    }
    public Person2(String initialName){
        name = initialName;

    }
    public void setName(String newName){
        name = newName;

    }
    public String getName(){
        return name;

    }
    public void writeOutput(){
        System.out.println("Name: " + name);
    }

    public boolean hasSameName(Person2 otherPerson){
        return this.name.equalsIgnoreCase(otherPerson.name);
    }



    
}
