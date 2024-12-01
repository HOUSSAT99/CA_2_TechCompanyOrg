/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simplescannerexample;

import java.util.Scanner;


/**
 *
 * @author Ken Healy
 */
public class SimpleScannerExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner myKB = new Scanner(System.in); //standard scanner declaration for keyboard input
        String myName;
        
        System.out.println("Please enter your name"); //display prompt
        
        myName = myKB.nextLine(); // this gets the input from the keyboard - reads the whole line
        
        System.out.println("Hello " + myName);
        
        int age=0; // set a default
        
        //prompt
        System.out.println("How old are you?");
        
        //see if I read in an integer
        try{
            age = myKB.nextInt(); // try to read input as an int
        
            System.out.println("Wow, you don't look " + age);
            
              
        }catch (Exception e){
            //input was not an integer - output error message
            System.out.println("You did not enter an integer for your age.");
            
        }
    }
    
}
    
