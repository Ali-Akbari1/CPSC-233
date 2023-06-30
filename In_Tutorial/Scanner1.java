package In_Tutorial;
import java.util.*;

public class Scanner1 {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please type 0.2");
        double a = input.nextDouble();

        System.out.println("Please type 0.3");
        double b = input.nextDouble();

        double answer;
        answer = a*b;
        System.out.println(answer);
    }
}
