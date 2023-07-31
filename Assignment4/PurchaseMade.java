package Assignment4;

import java.io.*;
import java.util.Scanner;

public class PurchaseMade{

    public static void main(String[] args){

        String fileName = "Q1.txt";
        PrintWriter outputStream = null;

        try{
            outputStream = new PrintWriter(new FileOutputStream ("Q1.txt", true));
        }

        catch(FileNotFoundException e){
            System.out.println("Error opening the file " + 
            fileName);
            System.exit(0);

        }

        String itemName = "";
        double price;
        int quantity;
        double currentCost = 0.0;

        boolean running = true;

        Scanner keyboard = new Scanner(System.in);

        while(running){
            System.out.println("What is the item's name that you purchased? (or type no to exit)");
            itemName = keyboard.next();

            if (itemName.equalsIgnoreCase("n") || itemName.equalsIgnoreCase("no")){
                running = false;
                break;
            }
            System.out.println("What was the cost of the item?");
            price = keyboard.nextDouble();

            System.out.println("How many of the item did you purchase? ");
            quantity = keyboard.nextInt();


            currentCost += quantity*price; 
            System.out.println(itemName + " price: " + price + " quantity: " + quantity + " current total cost: " + currentCost);
            outputStream.println("Item Name: " + itemName + " price: " + price + " quantity: " + quantity + " current total cost: " + currentCost);
        }

        System.out.println("Total Cost: " + currentCost);
        outputStream.println("Total Cost: " + currentCost);
        outputStream.close( );


    }



}