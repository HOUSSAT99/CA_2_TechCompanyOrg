package CA_2;

import java.io.*;
import java.util.*;

public class TechCompanyOrg {

    private static final String FILE_NAME = "Application_form.txt";

    public static void main(String[] args) {
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
            scanner.nextLine();

            if (input < 1 || input > MenuOption.values().length) {
                System.out.println("Invalid option. Please try again.");
                continue;
            }

            choice = MenuOption.values()[input - 1];

            switch (choice) {
                case SORT:
                    List<Employee> sortedEmployees = readEmployeesFromFile();
                    sortedEmployees.sort(Comparator.comparing(Employee::getName, String.CASE_INSENSITIVE_ORDER));
                    System.out.println("\nTop 20 Sorted Employees:");
                    for (int i = 0; i < 20 && i < sortedEmployees.size(); i++) {
                        Employee emp = sortedEmployees.get(i);
                        System.out.println((i + 1) + ". " + emp);
                    }
                    break;

                case SEARCH:
                    List<Employee> employeeList = readEmployeesFromFile();
                    System.out.print("Enter name to search: ");
                    String searchName = scanner.nextLine();
                    boolean found = false;
                    for (Employee emp : employeeList) {
                        if (emp.getName().equalsIgnoreCase(searchName)) {
                            System.out.println("Employee found: " + emp);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Employee not found.");
                    }
                    break;

                case ADD:
                    System.out.print("Enter Employee Name: ");
                    String newName = scanner.nextLine();

                    ManagerType selectedManagerType = selectManagerType(scanner);
                    DepartmentName selectedDepartment = selectDepartment(scanner);

                    Employee newEmployee = new Employee(newName, selectedManagerType, selectedDepartment);
                    writeEmployeeToFile(newEmployee);

                    System.out.println("\nNew Employee Created Successfully:");
                    System.out.println(newEmployee);
                    break;

                case GENERATE:
                    System.out.println("Generating Random Employees...");
                    String[] sampleNames = {"Zakaria", "Alice", "John", "Emily", "Bob", "Charlie", "Dave", "Eva",
                            "Frank", "Grace", "Helen", "Isaac", "Jill", "Kyle", "Laura"};
                    System.out.print("How many employees do you want to generate? ");
                    int numberOfEmployees = scanner.nextInt();
                    scanner.nextLine();
                    for (int i = 0; i < numberOfEmployees; i++) {
                        String randomName = sampleNames[(int) (Math.random() * sampleNames.length)];
                        ManagerType randomManager = ManagerType.values()[(int) (Math.random() * ManagerType.values().length)];
                        DepartmentName randomDepartment = DepartmentName.values()[(int) (Math.random() * DepartmentName.values().length)];
                        Employee randomEmployee = new Employee(randomName, randomManager, randomDepartment);
                        writeEmployeeToFile(randomEmployee);
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

    private static List<Employee> readEmployeesFromFile() {
        System.out.println("Reading from file: " + new File(FILE_NAME).getAbsolutePath());
    List<Employee> employees = new ArrayList<>();
    try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
        String line;
        boolean isFirstLine = true;
        while ((line = br.readLine()) != null) {
            if (isFirstLine) { // Skip header
                isFirstLine = false;
                continue;
            }

            String[] parts = line.split(",");
            if (parts.length == 3) {
                String name = parts[0].trim();
                String managerStr = parts[1].trim();
                String departmentStr = parts[2].trim();

                // Defensive: check if valid enum values
                try {
                    ManagerType manager = ManagerType.valueOf(managerStr);
                    DepartmentName department = DepartmentName.valueOf(departmentStr);
                    employees.add(new Employee(name, manager, department));
                } catch (IllegalArgumentException e) {
                    System.out.println("Invalid entry skipped: " + line);
                }
            }
        }
    } catch (IOException e) {
        System.out.println("Error reading file: " + e.getMessage());
    }
    return employees;
}



    private static void writeEmployeeToFile(Employee emp) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            bw.newLine();
            bw.write(emp.getName() + "," + emp.getManagerType() + "," + emp.getDepartment());
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    private static ManagerType selectManagerType(Scanner scanner) {
        System.out.println("Select Manager Type:");
        for (int i = 0; i < ManagerType.values().length; i++) {
            System.out.println((i + 1) + ". " + ManagerType.values()[i]);
        }
        int choice;
        while (true) {
            System.out.print("Enter choice: ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine();
                if (choice >= 1 && choice <= ManagerType.values().length) break;
            } else scanner.next();
            System.out.println("Invalid input. Try again.");
        }
        return ManagerType.values()[choice - 1];
    }

    private static DepartmentName selectDepartment(Scanner scanner) {
        System.out.println("Select Department:");
        for (int i = 0; i < DepartmentName.values().length; i++) {
            System.out.println((i + 1) + ". " + DepartmentName.values()[i]);
        }
        int choice;
        while (true) {
            System.out.print("Enter choice: ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine();
                if (choice >= 1 && choice <= DepartmentName.values().length) break;
            } else scanner.next();
            System.out.println("Invalid input. Try again.");
        }
        return DepartmentName.values()[choice - 1];
    }
}
