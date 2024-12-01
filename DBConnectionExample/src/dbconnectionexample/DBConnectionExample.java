/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconnectionexample;

import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author Ken
 */
public class DBConnectionExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner myKB = new Scanner(System.in);
        
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employees","root","SQLKen21#CCT"); 
            
            
            /*
              CONNECTION NOTES
               1) employees   --> this is the name of the database I am using; your could be different!
               2) root --> this is the user name; there's a good chance you have used root also, but again it might be different
               3) the last part is the user password for the user 'root' that I have; you will have a DIFFERENT password, so you need to use yours!
            */
        
            System.out.println("Connected to DB..."); //this is really just to be sure that the code executed :)
            
            Statement stmt=con.createStatement();  // we can use stmt to run any SQL statement now
            
            
            
           // stmt.execute("Create table IF NOT EXISTS People( personID INT AUTO_INCREMENT PRIMARY KEY, name varchar(50) NOT NULL)");
            
            //String baseInsert = "INSERT INTO People (personID, name) VALUES ( DEFAULT, \'";
            
          /*
            
            for (int i = 0; i< 10; i++){
            
                System.out.println("Please enter a name:");
                String name = myKB.nextLine();
                String dataToInsert = baseInsert.concat(name + "\')");
                
                stmt.execute(dataToInsert);
                
                        
            }*/
            
            //test an SQL query
            System.out.println("Enter a letter to search for a name:");
            String letter = myKB.nextLine();
            // change Employees to the table name you want to use
            //in theory you could prompt the user, or find this info using another query!
            String myQuery = "Select * from  Employees WHERE first_name LIKE \'" + letter + "%\'";
            //   Select * From Employees WHERE First_name LIKE 'A%' 
            // if user entered A
            
            
            
            
          
            
            String myColumnsQuery = "SELECT `COLUMN_NAME` " + "FROM INFORMATION_SCHEMA.COLUMNS WHERE  `TABLE_NAME`='Employees'";
            //This will list all the column names in the table 'Employees' in my DB
            
            ResultSet myColumnsResult = stmt.executeQuery(myColumnsQuery);
            
            //output all the column names 1-by-1
            while (myColumnsResult.next()){
                
                System.out.println("Column Name:" + myColumnsResult.getString(1));
            }
            
            System.out.println("*************");
            
             ResultSet queryResults = stmt.executeQuery(myQuery); //This runs the query to get employee names
             
             //display names 1-by-1 with some v. basic formatting
            while (queryResults.next()){
                
                
                System.out.println( "Employee ID: " + queryResults.getInt("emp_no") + "\t FIRSTNAME: " + queryResults.getString("first_name") + " \t SURNAME: " + queryResults.getString("last_name"));
                
               /*
                Notes:
                
                  getInt(1) means column number 1 is retrieved as an integer value
                  getString (3) means column number 3 is retrieved as a String value
                */
                
                       
            }
            
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
