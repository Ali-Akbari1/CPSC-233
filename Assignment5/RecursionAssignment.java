package Assignment5;


public class RecursionAssignment {

    public static int addDigits(int n){

        if (n ==0){
            return 0;
        }
        
        return n%10+(addDigits(n/10));
    }

    public static int sumEvenNumbers(int n){

        if (n == 0){
            return 0;
        }
        else if (n % 2 == 0){
            return n +sumEvenNumbers(n-1);
        }
        else{
            return sumEvenNumbers(n-1);
        }


    }

    public static int countVowels(String s){

        if (s.length() == 0) return 0;



        int temp = countVowels(s.substring(1));

        char c = s.charAt(0);

        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || 
            c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
            temp++;
        }

        return temp;
    }


    public static String removeVowels(String s){
        if (s.length() == 0) return "";

        String temp = removeVowels(s.substring(1));

        char c = s.charAt(0);

        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || 
            c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
            return temp;
        }

        return c + temp;
    }

    public static void main(String[] args){
        System.out.println(addDigits(12345));
        System.out.println(sumEvenNumbers(16));
        System.out.println(countVowels("Mississippi"));
        System.out.println(removeVowels("HelloYou"));
    }
    
}
