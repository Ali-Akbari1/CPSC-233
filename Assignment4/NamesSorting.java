package Assignment4;

import java.io.*;
import java.util.Scanner;

public class NamesSorting {

    public static void main(String[] args){

        String fileName = "PeopleNames.txt";
        String outputFile = "output.txt";
        Scanner inputStream = null;
        PrintWriter outputStream = null;
        try{
            inputStream = new Scanner(new File(fileName));
            outputStream = new PrintWriter(outputFile);
        }

        catch(FileNotFoundException e){
            System.out.println("Error opening the file " + 
            fileName);
            System.exit(0);

        }
       /* catch(IOException e)
		
		{
			System.out.println("Problem Reading File");
            System.exit(0);
		}
*/      
        int count = 0;
        while (inputStream.hasNext())
        {

            String line = inputStream.next();
            System.out.println(line);
            if (count < 2){
                outputStream.print(line + " ");
                count++;
                }
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
