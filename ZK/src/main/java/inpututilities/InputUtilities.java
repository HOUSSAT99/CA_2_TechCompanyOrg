/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inpututilities;

import java.util.Scanner;

/**
 * HDIP Comp Sept 2024 cohort
 * An example of using methods that you have written yourself
 * 
 * To use these in another program, you need to:
 * 1) COPY the entire package 'inpututilities'
 * 2) Go to the project where you want to use the methods
 * 3) Select 'Source Packages' and paste. This will create a copy of the 'inpututilities' package in the project
 * 4) At the top of your code, you will need to import InputUtilities
 * 
 * @author kheal
 */
public class InputUtilities {

    
    
    /**
     * Ask user to enter some  text - if they enter non-text (like numbers)
     * then ask them again
     * @param prompt - the question or prompt to ask the user
     * @return a String containing whatever text the user entered
     */
    public String askUserForText(String prompt){
        
        Scanner myKB = new Scanner(System.in);
        String userInput ;
        
        do{
            System.out.println(prompt);
            System.out.println("You must enter text only.");
            
            userInput = myKB.nextLine();            
            
        }while (!userInput.matches("[a-zA-Z .!@?\"]"));
        //userinput must be valid text
        
        return (userInput);
    }
    
    /**
     * Ask the user to enter any integer value (negatives are allowed)
     * if they do not enter an integer ask them again
     * @param prompt the question or prompt to ask the user
     * @return a valid int entered by the user
     */
    public int askUserForInt(String prompt){
        
        Scanner myKB = new Scanner(System.in);
        String userInput ;
        
        do{
            System.out.println(prompt);
            System.out.println("You must enter integers only.");
            
            userInput = myKB.nextLine();            
            
        }while (!userInput.matches("[0-9]+"));
       
        //userinput is a string but it is numeric - convert to int
        return (Integer.parseInt(userInput));
    }
    
    /**
     * Ask user for an integer value bigger than a given minimum
     * if they do not enter a valid integer ask them again
     * @param prompt the question or prompt to ask user
     * @param minValue the lowest value allowed
     * @return a valid int bigger than minValue
     */
    public int askUserForInt(String prompt, int minValue){
        
        Scanner myKB = new Scanner(System.in);
        int userInput= minValue -1;
        
        do{
            System.out.println(prompt);
            System.out.println("You must enter integers greater than " + minValue + " only.");
            try{
                userInput = myKB.nextInt();            
            
            }
            catch(Exception e){
                //this means user did not enter an int
                // so userInput is not changed
                System.out.println("That was not an integer value");
            }
            //keep going while userInput is less than min allowed
        }while ( (userInput < minValue));
       
        return (userInput);
        
    }
    
    /**
     * Ask user for an integer value in a given range
     * if they do not enter a valid integer ask them again
     * @param prompt the question or prompt to ask user
     * @param minValue the lowest value allowed
     * @param maxValue the highest value allowed
     * @return a valid int within the given range
     */
    public int askUserForInt(String prompt, int minValue, int maxValue){
        
        Scanner myKB = new Scanner(System.in);
        int userInput=0;
        
        return 0;
    }
}
