package In_Class;

public class UnderGraduate extends Student {
    private int level; 
    public UnderGraduate(){
        super();
        level = 1;
    }

    public UnderGraduate(String initialName, int initialStudentNumber, int initialLevel){
        super(initialName, initialStudentNumber);
        setLevel(initialLevel);
    }

    public void reset(String initialName, int initialStudentNumber, int initialLevel){
      reset(initialName, initialStudentNumber);
       setLevel(initialLevel); 
    }
    
    public void setLevel(int newLevel){
        if (newLevel >= 1 && newLevel <= 1){
            level = newLevel;

        }
        else{
            System.out.println("illegal level");
            System.exit(0);

        }

    }

    public void writeOutput(){
        super.writeOutput();
        System.out.println("Student level: " + level);
    }

}
