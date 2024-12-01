/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package password.checker;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class PasswordChecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // ask user to enter a password 
        Scanner Myzk = new Scanner(System.in);
        
        
        System.out.println("enter the colour of the traffic lights (Red, Orange or Green)");
        
        String colour = Myzk.nextLine();
        if (colour == "Red") {
            
        System.out.println("STOP");
    }
        else if (colour == "orange"){
        System.out.println("Slow down");
    }
        else if (colour == "Green"){
        System.out.println("keep going");
    }
    }
        
    
    
}
