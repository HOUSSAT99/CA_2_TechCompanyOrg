/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CA_2;

/**
 *
 * @author Lenovo
 */
public class Employee {
    private String name;
    private int employeeID;
    private DepartmentName department;
    private ManagerType managerType;

    public Employee(String name, int employeeID, DepartmentName department, ManagerType managerType) {
        this.name = name;
        this.employeeID = employeeID;
        this.department = department;
        this.managerType = managerType;
    }

    public String getName() { return name; }
    public int getEmployeeID() { return employeeID; }
    public DepartmentName getDepartment() { return department; }
    public ManagerType getManagerType() { return managerType; }

    @Override
    public String toString() {
        return employeeID + " | " + name + " | " + department + " | " + managerType;
    }
    
}
