package Assignment3;

public class Assignment4MainMethod {
    public static void main(String[] args){
        Person4[] people = new Person4[4];

        people[0] = new Person4(1.80 , 18, "John Doe", 70.45);
        people[1] = new Girl(5.5,"Female", 1.53, 12, "Jane Doe", 41.67);
        people[2] = new Boy(9.5,"male", 1.86, 25, "Ryan Nguyen",72.3);
        people[3] = new Boy(8.5,"male", 1.74, 18, "Ali Muhammad", 91.7); 

        System.out.println("Is " + people[0].getName() + " the same age as " + people[1].getName() + " " + people[0].isSameAge(people[1]));
        System.out.println("Is " + people[0].getName() + " the same age as " + people[3].getName() + " " + people[0].isSameAge(people[3]));
        System.out.println("Is " + people[1].getName() + " the same age as " + people[2].getName() + " " + people[1].isSameAge(people[2]));
        System.out.println("Is " + people[2].getName() + " the same age as " + people[3].getName() + " " + people[2].isSameAge(people[3]));

        System.out.println("The BMI of " + people[0].getName() + " " + people[0].calculateBMI());
    }
    
}
