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
                case SEARCH: // Create a dummy employee list
                    Employee[] employees = {
                        new Employee("Alice", 1001, DepartmentName.SOFTWARE_DEVELOPMENT, ManagerType.TEAM_LEAD),
                        new Employee("Bob", 1002, DepartmentName.HUMAN_RESOURCES, ManagerType.HEAD_MANAGER),
                        new Employee("Charlie", 1003, DepartmentName.TECH_SUPPORT, ManagerType.PROJECT_MANAGER),
                        new Employee("Emily", 1004, DepartmentName.SOFTWARE_DEVELOPMENT, ManagerType.TEAM_LEAD),
                        new Employee("Zakaria", 1005, DepartmentName.TECH_SUPPORT, ManagerType.HEAD_MANAGER)  
                    };
                    // First, sort the list by name
                    String[] employeeNames = new String[employees.length];
                    for (int i = 0; i < employees.length; i++) {
                            employeeNames[i] = employees[i].getName();
                    }
                    mergeSort(employeeNames, 0, employeeNames.length - 1);
                    // Rebuild sorted employee array
                    Employee[] sortedEmployees = new Employee[employees.length];
                    for (int i = 0; i < employeeNames.length; i++) {
                        for (Employee emp : employees) {
                            if (emp.getName().equalsIgnoreCase(employeeNames[i])) {
                                sortedEmployees[i] = emp;
                                break;
                            }
                        }
                    }
                    // User input
                    System.out.print("Enter name to search: ");
                    String searchName = scanner.nextLine();
                    
                    Employee result = binarySearch(sortedEmployees, searchName);
                    if (result != null) {
                        System.out.println("Employee found:");
                        System.out.println("Name: " + result.getName());
                        System.out.println("Manager Type: " + result.getManagerType());
                        System.out.println("Department: " + result.getDepartment());
                    }else{
                      System.out.println("Employee not found.");  
                    }
                    break;
               
                case ADD:
                    System.out.print("Enter Employee Name: ");
                    String newName = scanner.nextLine();
                    
                    // Manager Type selection
                    System.out.println("Select Manager Type:");
                    int index = 1;
                    for (ManagerType type : ManagerType.values()) {
                        System.out.println(index + ". " + type);
                        index++;
                        }
                    int managerChoice = 0;
                    boolean validManagerChoice = false;
                    while (!validManagerChoice) {
                        System.out.print("Enter choice (1-" + ManagerType.values().length + "): ");
                         if (scanner.hasNextInt()) {
                             managerChoice = scanner.nextInt();
                        
                             if (managerChoice >= 1 && managerChoice <= ManagerType.values().length) {
                            validManagerChoice = true;
                        } else {
                            System.out.println("Invalid Manager choice. Try again.");
                        }
                    } else {
                            System.out.println("Invalid input. Please enter a number.");
                            scanner.next();
                         }
                    }

                    scanner.nextLine(); // Consume newline
                    ManagerType selectedManagerType = ManagerType.values()[managerChoice - 1];
                    
                    // Department selection
                    System.out.println("\nSelect Department:");
                    index = 1;
                    for (DepartmentName dept : DepartmentName.values()) {
                        System.out.println(index + ". " + dept);
                        index++;
                        }
                    int deptChoice = 0;
                    boolean validDeptChoice = false;
                    while (!validManagerChoice) {
                        System.out.print("Enter choice (1-" + DepartmentName.values().length + "): ");
                        if (scanner.hasNextInt()) {
                            deptChoice = scanner.nextInt();
                            if (deptChoice >= 1 && deptChoice <= DepartmentName.values().length) {
                                validManagerChoice = true;
                            }else{
                                System.out.println("Invalid Department choice. Try again.");
                            }
                        } else {
                            System.out.println("Invalid input. Please enter a number.");
                            scanner.next();
                        }
                    }
                        scanner.nextLine();
                        DepartmentName selectedDepartment = DepartmentName.values()[deptChoice - 1];
                        
                        // Create and display the new Employee
                        Employee newEmployee = new Employee(newName, (int) (Math.random() * 10000), selectedDepartment, selectedManagerType);
                        System.out.println("\nNew Employee Created Successfully:");
                        System.out.println(newEmployee);
                        
                    break;
                    
                case GENERATE:
                    System.out.println("Generating Random Employees...");
                    String[] sampleNames = {
                        "Zakaria", "Alice", "John", "Emily", "Bob", "Charlie", "Dave", "Eva",
                        "Frank", "Grace", "Helen", "Isaac", "Jill", "Kyle", "Laura"
                    };
                    System.out.print("How many employees do you want to generate? ");
                    int numberOfEmployees = 0;
                    if (scanner.hasNextInt()) {
                        numberOfEmployees = scanner.nextInt();
                         scanner.nextLine(); // consume newline
                    }else{
                        System.out.println("Invalid number. Returning to menu.");
                        scanner.nextLine(); // consume invalid input
                        break;
                    }
                    for (int i = 0; i < numberOfEmployees; i++) {
                        String randomName = sampleNames[(int) (Math.random() * sampleNames.length)];
                        ManagerType randomManager = ManagerType.values()[(int) (Math.random() * ManagerType.values().length)];
                        DepartmentName randomDepartment = DepartmentName.values()[(int) (Math.random() * DepartmentName.values().length)];
                        int randomID = (int) (Math.random() * 10000);
                        Employee randomEmployee = new Employee(randomName, randomID, randomDepartment, randomManager);
                        
                        System.out.println(randomEmployee);
                    }
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
public static Employee binarySearch(Employee[] employees, String target) {
    int left = 0;
    int right = employees.length - 1;

    while (left <= right) {
        int mid = (left + right) / 2;
        int cmp = employees[mid].compareByName(target);

        if (cmp == 0) return employees[mid];
        else if (cmp < 0) left = mid + 1;
        else right = mid - 1;
    }
    return null;

}

    
    
}
