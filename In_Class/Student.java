package In_Class;

public class Student extends Person2 {
    private int studentNumber;

    public Student(){
        super();
        studentNumber = 0;
    }

    public Student(String initialName, int initialNumber){
        super(initialName);
        studentNumber = initialNumber;
    }

    public void reset(String newName, int initialNumber){
        setName(newName);
        studentNumber = initialNumber; 
    }

    public void setStudentNumber(int newStudentNumber){
        studentNumber = newStudentNumber;
    }

    public int getStudentNumber(){
        return studentNumber;
    }

    public void writeOutput(){
        super.writeOutput();
        System.out.println("Student Number: " + studentNumber);
    }

    public boolean equals(Student otherStudent){
        return this.hasSameName(otherStudent) &&
        (this.studentNumber == otherStudent.studentNumber);
    }
    
}
