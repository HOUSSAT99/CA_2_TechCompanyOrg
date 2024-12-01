/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enter.a.number;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class EnterANumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creat a Scanner object to read input 
        Scanner mysc = new Scanner(System.in);
        int myv;
        myv = mysc.nextInt(); // ask the user to enter a number 
       
        if (myv>100) {
        System.out.println("Too big");
        }else{ 
            System.out.println("perfect");
        }
        
        
        
        // 
        
    }
    
}
