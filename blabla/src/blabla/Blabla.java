/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package blabla;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Blabla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner MYZK = new Scanner(System.in);
        int age;
       do {
           System.out.println("enter a number between 1 and 10");
           age = MYZK.nextInt();
       }while (age < 1 || age > 10);
        System.out.println(age + " is between 1 and 10");
  
       
        
    }
    
}
