/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.zk;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class ZK {

    public static void main(String[] args) {
         final String correctPassword = "03081999fes";
        final int maxAttempts = 5;
        
        Scanner scanner = new Scanner(System.in);

        for (int attempts = 1; attempts <= maxAttempts; attempts++) {
            System.out.print("Enter password (you have " + (maxAttempts - attempts + 1) + " attempts left): ");
            if (scanner.nextLine().equals(correctPassword)) {
                System.out.println("Access granted");
                scanner.close();
                return;
            }
            System.out.println("Incorrect password.");
        }

        System.out.println("Access denied. You are now locked out of the system.");
         
         
         
         }
         
         
         
        }

