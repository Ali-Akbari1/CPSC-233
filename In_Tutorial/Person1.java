package In_Tutorial;

import java.util.ArrayList;
class Pet {
    public String name;

    public Pet(String name) {
        this.name = name;
    }
}

public class Person1 {

    private String name;
    private int age;
    private ArrayList<Pet> pets;

    public static int averageAge() {
        return 40;
    }

    public Person1() {
        this("");
        this.pets = new ArrayList<>();
    }

    public Person1(String name) {
        this.name = name;
        age = 0;
        this.pets = new ArrayList<>();
    }

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
        this.pets = new ArrayList<>();
    }

    public Person1(Person1 p) {
        this(p.getName(), p.getAge());
        this.pets = new ArrayList<>();
    }

    public Person1 copy() {
        return new Person1(this.getName(), getAge());
    }

    public void addPet(String name) {
        pets.add(new Pet(name));
    }

    public void removePet(int index) {
        pets.remove(index);
    }

    public void removePet(String name) {
        int index = searchPet(name);
        removePet(index);
    }

    public void printPets() {
        for (int index = 0; index < pets.size(); index++) {
            System.out.println(pets.get(index).name);
        }
    }

    public int searchPet(String name) {
        for (int index = 0; index < pets.size(); index++) {
            if (pets.get(index).name.equals(name)) {
                return index;
            }
        }
        return -1;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void birthday() {
        System.out.println("HBD to " + name);
        setAge(age + 1);
        System.out.println("new age: " + age);
    }
} 