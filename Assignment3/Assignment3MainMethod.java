package Assignment3;

public class Assignment3MainMethod {
    public static void main(String[] args){
        Person[] people = new Person[4];

        people[0] = new Person(180 , 18, "John, Doe", 60);
        people[1] = new Girl(5.5,"Female", 153, 12, "Jane Doe", 41);
        people[2] = new Boy(9.5,"male", 186, 25, "Ryan Nguyen",72);
        people[3] = new Boy(8.5,"male", 174, 19, "Ali Muhammad", 91); 
    }
    
}
