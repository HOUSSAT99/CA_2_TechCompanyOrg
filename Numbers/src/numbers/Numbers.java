/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numbers;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Numbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creat a scanner object to read the input 
        Scanner mySC = new Scanner(System.in);
        double num1;
        double num2;
        
        
        // ask the user to use two numbers
        System.out.println("enter a first number: ");
        num1 = mySC.nextDouble();
        System.out.println("enter a secound number: ");
         num2 = mySC.nextDouble();
        
       
     
        // compare which number is bigger 
        if (num1 > num2) {
        System.out.println("the first number is bigger");
        } 
        if( num1 < num2){
         System.out.println("second number is bigger");
        }
        else {
           System.out.println("both numbers are the same");
        }
            
        
       /*
        if else (num1<num2) {
        System.out.println("second number is bigger");
        } if else (num1 == num2) {
        System.out.println("both numbers are the same");
        }
        
        */
        //close the scanner
        mySC.close();
    
   
            
            
    }
        
        
    }
    

