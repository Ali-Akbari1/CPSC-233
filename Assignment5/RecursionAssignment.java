package Assignment5;

import java.util.ArrayList;
import java.util.List;

public class RecursionAssignment {

    public static int addDigits(int n){

        if (n ==0){
            return 0;
        }

        int num;

        num = n % 10;

        System.out.println(n);
        
        return n+(addDigits(num/10));
    }

    public static void main(String[] args){
        System.out.println(addDigits(12345));
    }
    
}
