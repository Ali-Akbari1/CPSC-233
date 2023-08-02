package Assignment4;

import java.io.*;
import java.util.Scanner;

public class PurchasesMade{

    public static void main(String[] args){

        String fileName = "Q1.txt";
        PrintWriter outputStream = null;

        // Try file names
        try{
            outputStream = new PrintWriter(new FileOutputStream ("Q1.txt", true));
        }

        // Catch if the file is not found
        catch(FileNotFoundException e){
            System.out.println("Error opening the file " + 
            fileName);
            e.printStackTrace();
            System.exit(0);

        }

        String itemName = "";
        double price;
        int quantity;
        double currentCost = 0.0;
        boolean running = true;

        Scanner keyboard = new Scanner(System.in);

        // While the user is purchasing items
        while(running){

            // Item name from user, or they exit out the system
            System.out.println("What is the item's name that you purchased? (or type no to exit)");
            itemName = keyboard.next();

            if (itemName.equalsIgnoreCase("n") || itemName.equalsIgnoreCase("no")){
                running = false;
                break;
            }

            // Cost of the item
            System.out.println("What was the cost of the item?");
            price = keyboard.nextDouble();

            // Quantity of items purchased
            System.out.println("How many of the item did you purchase? ");
            quantity = keyboard.nextInt();


            // Cost is quantity times the price
            currentCost += quantity*price; 

            // Print to file and to the terminal
            System.out.println(itemName + " price: " + price + " quantity: " + quantity + " current total cost: " + currentCost);
            outputStream.println("Item Name: " + itemName + " price: " + price + " quantity: " + quantity + " current total cost: " + currentCost);
        }

        // Print total cost to file and terminal
        System.out.println("Total Cost: " + currentCost);
        outputStream.println("Total Cost: " + currentCost);
        outputStream.close( );


    }



}