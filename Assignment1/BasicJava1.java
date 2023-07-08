// Ali Akbari, UCID: 30171539
package Assignment1;

import java.util.*;



public class BasicJava1{

    // Method that takes in an argument celsius and converts it into fahrenheit
    public static double ConvertToFahrenheit(double celsius){
        double fahrenheit;
        
        fahrenheit = (celsius * 1.8) + 32;

        return fahrenheit;

    }

    /* 
    Method that takes in two arguments start and end
    Returns the value of the sum of all odd integers 
    Not including the end
    */
    public static int sumOddRange(int start, int end){
        int sum = 0;
        for (; start < end; start++){
            if (start % 2 != 0){
                sum += start;
            }
        }

        return sum;
    }

    // Method that counts the number of characters in a string
    public static int countChar(String s, char c){
        int n = 0;

        /* 
        Loop through string and check if character is in string
        If it is update n by 1
        */
        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if (ch == c){
                n+=1;
            }
        }
        return n;
    }

    // Method that takes in a argument and checks if the string is a palindrome
    public static boolean isPalindrome(String s){
        String str = s.toLowerCase();
        int lenOfString = str.length();
        char[] reverseArray = new char[lenOfString];
        char[] normalArray = new char[lenOfString];

        // Put characters from string into an array
        int j = 0;
        for (int i = 0; i < lenOfString; i++){
            normalArray[i] = str.charAt(i);

        }
        // Put characters from string into an array in reverse
        for (int i = lenOfString-1; i >= 0; i--){
            reverseArray[j] = str.charAt(i);
            j+= 1;
        }

        // If the the reversed array equals the non reversed array they are palindromes
        if (Arrays.equals(normalArray, reverseArray)){
            return true;
        }
        else{
            return false;
        }
}

    /* 
    Method that takes in two list arguments
    movieList and ratingList and checks the highest rated movie
    */
    public static String highestRatedMovie(String[]movieList, double[]ratingList){
        int index = 0;

        /* 
        Loops through the list and puts the ratings into a variable n
        n1 is the rating before the current index
        */
        for (int i = 0; i < movieList.length; i++){
            double n1 = 0.0;
            double n = ratingList[i];
            
            /* 
            If it is the first element of the list n1 equals the first rating
            Otherwise it is the element before the current index
            */
            if (i == 0){
                n1 = ratingList[i];
            }
            else{
                n1 = ratingList[i-1];
            }

            /* 
            If the rating is greater than the one before it, update the index
            until there are no ratings greater
            */
            if (n > n1){
                index = i;
            }


        }
        String s2 = "The highest rated Movie is " + movieList[index];
        return s2;
    }


    /* 
    Method that takes in two list arguments
    movieList and ratingList and checks the lowest rated movie
    */
    public static String lowestRatedMovie(String[] movieList, double[] ratingList){
        int index = 0;

        /* 
        Loops through the list and puts the ratings into a variable n
        n1 is the rating before the current index
        */
        for (int i = 0; i < movieList.length; i++){
            double n1 = 0.0;
            double n = ratingList[i]; 

            /* 
            If it is the first element of the list n1 equals the first rating
            Otherwise it is the element before the current index
            */
            if (i == 0){
                n1 = ratingList[i];
            }
            else{
                n1 = ratingList[i-1];

            /* 
            If the rating is lower than the one before it, update the index
            until there are no ratings lower
            */
            }
            if (n < n1){
                index = i;
            
        }
    }
        String s2 = "The lowest rated Movie is " + movieList[index];
        return s2;
    }


    // Main function
    public static void main(String[] args){

        // Getting input from the user to pass to the methods
        Scanner keyboard = new Scanner(System.in);

        // ConvertToFahrenheit method
        System.out.println("Please type a temperature in celsius to convert to fahrenheit: ");
        double c = keyboard.nextDouble();

        // SumOddRange method
        System.out.println("Please type two numbers to add all odd numbers from the start not including the end");
        System.out.println("Starting Integer: ");
        int s = keyboard.nextInt();
        System.out.println("Ending Integer: ");
        int e = keyboard.nextInt();

        // Countchar method
        System.out.println("Please type a string and a character to check how many of that character are in that string");
        System.out.println("String: ");
        String str = keyboard.next();
        System.out.println("Character: ");
        char ch = keyboard.next().charAt(0);
        
        // IsPalindrome method
        System.out.println("Please type a string to check if it is a palindrome: ");
        String str1 = keyboard.next();


        // HighestRatedMovie and LowestRatedMovie method
        System.out.println("Please type the number of elements in your movie and rating list array");

        int n = keyboard.nextInt();
        String[] movieList = new String[n];
        double[] ratingList = new double[n];


        System.out.println("Enter the elements of the movie list array: ");  

        // For loop to to get the user input for movieList array
        for (int i = 0; i < n; i++){
            movieList[i] = keyboard.next();
            if (i != n-1){
                System.out.println("Please enter the next movie: ");
            }
        }

        System.out.println("Enter the elements of the rating list array: ");  

        // For loops to to get the user input for ratingList array
        for (int i = 0; i < n; i++){
            ratingList[i] = keyboard.nextDouble();
            if (i != n-1){
                System.out.println("Please enter the next rating: ");
            }
        }

        //All print statements to pass in user input variables to the methods
        System.out.println("Your temperature in fahrenheit is: " + ConvertToFahrenheit(c));

        System.out.println("The sum of the odd numbers are: " + sumOddRange(s, e));

        System.out.println("The number of characters in your string are: " + countChar(str, ch));

        System.out.println("Is it a palindrome: " + isPalindrome(str1));

        System.out.println(highestRatedMovie(movieList, ratingList));

        System.out.println(lowestRatedMovie(movieList, ratingList));

    }
}