package In_Class;

public class PolymorphismDemo {

    public static void main(String[] args){
        Person[] people = new Person[4];

        people[0]= new UnderGraduate("Cotty, Manny", 4910, 1);
        people[1]= new UnderGraduate("Kick, Anita", 4910, 2);
        people[2]= new Student("Doe, John", 4910);
        people[3]= new UnderGraduate("Bug, John", 910, 4 );

        for (Person p: people){
            p.writeOutput();
            System.out.println();
        }
    }
    
}
