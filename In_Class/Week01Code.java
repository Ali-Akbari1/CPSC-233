package In_Class;
import java.util.*;

public class Week01Code{

    public static String gradeDescription(char grade){

        if (grade == 'A') {
            return "Great Performance";
        }

        else if (grade == 'B'){
            return "Good Performance";
        }
        else if (grade == 'C'){
            return "Satisfactory Performance";
        }
        else if (grade == 'D'){
            return "Weak Performance";
        }
        else{
            return "Failure";
        }
    }

    public static char toLower(char c){
        if (c >= 'A' && c <= 'Z'){
            c = (char)(c+32);
        }
        return c;
    }

    public static int calculateSum(){
        int sum = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int number = keyboard.nextInt();

        while (number != 0){
            sum += number;
            System.out.println("Enter a Number: ");
            number = keyboard.nextInt();
            
        }
        return sum;
    }

    public static void main(String[] args){
        System.out.println(gradeDescription('A'));
        System.out.println("Lower case value of is A: " + toLower('A'));
        System.out.println("The sum of the numbers are: "+calculateSum());
    }
    
}
