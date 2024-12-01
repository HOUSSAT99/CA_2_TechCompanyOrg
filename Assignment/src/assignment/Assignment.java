/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment;

import static java.time.Clock.system;
import static java.time.InstantSource.system;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Assignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Creat a scanner object to get user input
        Scanner MySC = new Scanner (System.in);
        
        // check if mark that can be input is 100 and the minimum is 0 
        if (MySC.hasNextDouble()) {
            double mark = MySC.nextDouble();

            // Check if the mark is valid
            if (mark >= 0 && mark <= 100) {
                // Calculate the percentage equivalent
                double percentage = (mark / 100) * 25;
                System.out.printf("You scored %.2f%% out of a maximum of 25%%.%n", percentage);
            } else {
                // Error message 
                System.out.println("Error: Please enter a mark between 0 and 100.");
            }
        } else {
            // Error message for non-numeric input
            System.out.println("Error: Invalid input. Please enter a number.");
        }

        
    }
    
}
