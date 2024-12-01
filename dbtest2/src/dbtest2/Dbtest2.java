/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dbtest2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Dbtest2 {

   public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner myZK = new Scanner(System.in);
        
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","Houssat_99"); 
    }
        catch(SQLException e){
                    
            System.out.println("SQL Error --> ");
             System.out.println(e.getMessage()); //prints out the java error so you can google it :)
             System.out.println(e.getSQLState());//this will print out the exact message from the DB error
         }
        catch (ClassNotFoundException  e){
            
            System.out.println("Class error -- " + e.getMessage());
        }
}
}