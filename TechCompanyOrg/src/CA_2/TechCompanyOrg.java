/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CA_2;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class TechCompanyOrg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        MenuOption choice = null;

        do {
            System.out.println("\n=== Tech Company Employee System ===");
            System.out.println("Please choose an option:");
            for (MenuOption option : MenuOption.values()) {
                System.out.println(option.ordinal() + 1 + ". " + option);
            }

            System.out.print("Enter your choice: ");
            int input = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (input < 1 || input > MenuOption.values().length) {
                System.out.println("Invalid option. Please try again.");
                continue;
            }

            choice = MenuOption.values()[input - 1];

            switch (choice) {
                case SORT:
                    System.out.println("Sorting logic will go here.");
                    break;
                case SEARCH:
                    System.out.println("Searching logic will go here.");
                    break;
                case ADD:
                    System.out.println("Add employee logic will go here.");
                    break;
                case GENERATE:
                    System.out.println("Random employee generation logic will go here.");
                    break;
                case EXIT:
                    System.out.println("Exiting program. Goodbye!");
                    break;
            }

        } while (choice != MenuOption.EXIT);

        scanner.close();
    }
    
    
}
