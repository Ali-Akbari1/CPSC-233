package Assignment4;

import java.io.*;
import java.util.Scanner;

public class NamesSorting {

    public static void main(String[] args){

        String fileName = "PeopleNames.txt";
        String outputFile = "output.txt";
        Scanner inputStream = null;
        PrintWriter outputStream = null;

        // Try file names
        try{
            inputStream = new Scanner(new File(fileName));
            outputStream = new PrintWriter(outputFile);
        }

        // If file not found
        catch(FileNotFoundException e){
            System.out.println("Error opening the file " + 
            fileName);
            e.printStackTrace();
            System.exit(0);

        }
  

        int count = 0;

        // While loop that keeps going until there is something else in the file
        while (inputStream.hasNext())
        {

            String line = inputStream.next();

            // Print lines to the file until the first and last name is printed
            if (count < 2){
                outputStream.print(line + " ");
                count++;
                }

            // Once the last name is printed make a new line and print the next first name and set count to 1
            else{
                outputStream.println(" ");
                outputStream.print(line + " ");
                count = 1;
                }
        }

        outputStream.close( );
        inputStream.close();
    }
    
}
