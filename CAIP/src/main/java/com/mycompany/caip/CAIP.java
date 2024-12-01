/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.caip;


import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class CAIP {

    public static void main(String[] args) {
        Scanner MyZK = new Scanner(System.in);
        
        int n = 0; 
        // ask the user for the number of the word
        while(true){
            System.out.println("enter the number of the words you want to enter (1-29): ");
            boolean String;
            do {
                n = Integer.parseInt(scanner.nextLine());
                 if (n > 0 && n < 30) {
                    
                 }else{
                     System.out.println("enter a number greater than 0 and less than 30. "); }
          
                
                    System.out.println("Invalid input. please enter correct an integer");
           

        // Collect the words
        int countAK = 0;  // Counter for words beginning with 'A' or 'K'
        int countXZ = 0;  // Counter for words containing 'X' or 'Z'
        String longestWord = ""; // To store the longest word

        for (int i = 0; i < n; i++) {
            String word;
            while (true) {
                System.out.println("Enter a single word: ");
                word = MyZK.nextLine();
                if (word.matches("^[a-zA-Z]+$")) {  // Ensure the input is letters only
                  
                } else {
                    System.out.println("Invalid input. Please enter a single word with letters only.");
                }
            }

            // Check if the word is the longest
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
            
            // Check if the word starts with 'A' or 'K'
            char firstChar = Character.toUpperCase(word.charAt(0));
            if (firstChar == 'A' || firstChar == 'K') {
                countAK++;
            }

            // Check if the word contains 'X' or 'Z'
            String upperWord = word.toUpperCase();
            if (upperWord.contains("X") || upperWord.contains("Z")) {
                countXZ++;
            }
        }

        // Display the menu and handle user choices
        boolean running = true;
        while (running) {
            System.out.println("\n Choose an option:");
            System.out.println("1. Count words beginning with 'A'");
            System.out.println("2. Find the longest word");
            System.out.println("3. Count words containing 'X' or 'Z'");
            System.out.println("4. Exit");

            String choice = MyZK.nextLine();

            if (choice.equals("1")) {
                System.out.println("Count of words starting with 'A' or 'K': " + countAK);
            } else if (choice.equals("2")) {
                System.out.println("Longest word: " + longestWord);
            } else if (choice.equals("3")) {
                System.out.println("Words containing 'X' or 'Z': " + countXZ);
                System.out.println("Words without 'X' or 'Z': " + (n - countXZ));
            } else if (choice.equals("4")) {
                System.out.println("I cannot help with this problem because it looks like a test.");
                running = false;
            } else {
                System.out.println("Invalid option. Please choose again.");
            }
        }

    }
    }

    
