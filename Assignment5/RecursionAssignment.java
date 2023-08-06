package Assignment5;


public class RecursionAssignment {


    /* 
    Method that adds all of the digits of
    Parameter n
    */
    public static int addDigits(int n){

        // Base case if n equals 0 
        if (n ==0){
            return 0;
        }
        
        /* 
        This return statement returns the last digit and calls the function again 
        with the last digit removed
        */
        return n%10+(addDigits(n/10));
    }


    /* 
    Method that returns the sum of all the even numbers of the
    Parameter n
    */
    public static int sumEvenNumbers(int n){

        // Base case if n equals 0
        if (n == 0){
            return 0;
        }

        /* 
        This return statement adds the number if it is even 
        Then decrements n by 1 
        */
        else if (n % 2 == 0){
            return n +sumEvenNumbers(n-1);
        }

        /* 
        This return statement decrements n by 1 and
        Does not add it because it is an odd number
        */
        else{
            return sumEvenNumbers(n-1);
        }


    }

    
    /* 
    Method that returns the number of vowels 
    In a parameter String s
    */
    public static int countVowels(String s){

        // Base case if the string has length of 0
        if (s.length() == 0) return 0;


        /* 
        Call the function again
        And pass in everything after the first element
        */
        int temp = countVowels(s.substring(1));

        // Get the character at the first index of the string
        char c = s.charAt(0);

        // If the character is a vowel increment the variable by 1
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || 
            c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
            temp++;
        }

        return temp;
    }

    
    /* 
    Method that removes all the vowels 
    In a parameter String s
    */
    public static String removeVowels(String s){

         // Base case if the string has length of 0
        if (s.length() == 0) return "";

        /* 
        Call the function again
        And pass in everything after the first element
        */
        String temp = removeVowels(s.substring(1));

        // Get the character at the first index of the string
        char c = s.charAt(0);

        // If there is a vowel in the string return the same string
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || 
            c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){

            return temp;
        }

        // Otherwise return the character plus the string
        return c + temp;
    }

    // Main Method
    public static void main(String[] args){
        System.out.println(addDigits(12345));
        System.out.println(sumEvenNumbers(16));
        System.out.println(countVowels("Mississippi"));
        System.out.println(removeVowels("HelloYou"));
    }
    
}
