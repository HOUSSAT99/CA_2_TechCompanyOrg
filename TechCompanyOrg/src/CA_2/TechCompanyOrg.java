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
                    String[] names = {
                        "Zakaria", "Alice", "John", "Emily", "Bob", "Charlie", "Dave", "Eva", "Frank", "Grace",
                        "Helen", "Isaac", "Jill", "Kyle", "Laura", "Mike", "Nina", "Oscar", "Paul", "Quincy",
                        "Rachel", "Steve", "Tina", "Uma", "Victor", "Wendy", "Xavier", "Yasmine", "Zane"
                    };
                    mergeSort(names, 0, names.length - 1);
                    System.out.println("\nTop 20 Sorted Names:");
                    for (int i = 0; i < 20 && i < names.length; i++) {
                        System.out.println((i + 1) + ". " + names[i]);
                    }
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
    // Recursive Merge Sort
public static void mergeSort(String[] array, int left, int right) {
    if (left < right) {
        int middle = (left + right) / 2;

        mergeSort(array, left, middle);
        mergeSort(array, middle + 1, right);
        merge(array, left, middle, right);
    }
}

private static void merge(String[] array, int left, int middle, int right) {
    int n1 = middle - left + 1;
    int n2 = right - middle;

    String[] L = new String[n1];
    String[] R = new String[n2];

    for (int i = 0; i < n1; i++)
        L[i] = array[left + i];
    for (int j = 0; j < n2; j++)
        R[j] = array[middle + 1 + j];

    int i = 0, j = 0, k = left;

    while (i < n1 && j < n2) {
        if (L[i].compareToIgnoreCase(R[j]) <= 0) {
            array[k++] = L[i++];
        } else {
            array[k++] = R[j++];
        }
    }

    while (i < n1) array[k++] = L[i++];
    while (j < n2) array[k++] = R[j++];
}

    
    
}
