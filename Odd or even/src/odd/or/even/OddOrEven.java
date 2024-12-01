/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package odd.or.even;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class OddOrEven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is odd or even using modulus operator
        if (number % 2 == 0) {
            System.out.println("The number is EVEN.");
        } else {
            System.out.println("The number is ODD.");
        }

        // Close the scanner
        scanner.close();
    }
    
}
