package Assignment5;


public class RecursionAssignment {

    public static int addDigits(int n){

        if (n ==0){
            return 0;
        }

        

        n = n % 10;

        System.out.println(n);
        
        return n+(addDigits(n/10));
    }

    public static void main(String[] args){
        System.out.println(addDigits(12345));
    }
    
}
