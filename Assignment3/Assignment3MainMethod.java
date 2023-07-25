package Assignment3;

public class Assignment3MainMethod {
    // Main Function
    public static void main(String[] args) {

        // New list called people that will hold the objects
        Person[] people = new Person[4];

        people[0] = new Person(1.80, 18, "John Doe", 70.45);
        people[1] = new Girl(5.5, "Female", 1.53, 12, "Jane Doe", 41.67);
        people[2] = new Boy(9.5, "Male", 1.86, 25, "Ryan Nguyen", 72.3);
        people[3] = new Boy(8.5, "Male", 1.74, 18, "Ali Muhammad", 91.7);


        // Loop through the list and display the objects
        for (Person p: people){
            p.introduceYourself();
            p.writeOutput();
            System.out.println();
        }


        // Same age checker
        System.out.println("Is " + people[0].getName() + " the same age as " + people[1].getName() + " " + people[0].isSameAge(people[1]));
        System.out.println("Is " + people[0].getName() + " the same age as " + people[3].getName() + " " + people[0].isSameAge(people[3]));
        System.out.println("Is " + people[1].getName() + " the same age as " + people[2].getName() + " " + people[1].isSameAge(people[2]));
        System.out.println("Is " + people[2].getName() + " the same age as " + people[3].getName() + " " + people[2].isSameAge(people[3]));

    }
    
}
