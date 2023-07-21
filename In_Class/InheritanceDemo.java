package In_Class;


// We implement polymorphism using method overriding
public class InheritanceDemo {
    public static void main(String[] args){
        Student s = new Student();
        s.writeOutput();
        s.setName("John Doe");
        s.setStudentNumber(1234);
        s.writeOutput();

    }
    
}
