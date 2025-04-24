/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CA_2;

/**
 *
 * @author Lenovo
 */
public class Manager {
    private String name;
    private ManagerType managerType;
    private DepartmentName department;

    public Manager(String name, ManagerType managerType, DepartmentName department) {
        this.name = name;
        this.managerType = managerType;
        this.department = department;
    }

    public String getName() { return name; }
    public ManagerType getManagerType() { return managerType; }
    public DepartmentName getDepartment() { return department; }

    @Override
    public String toString() {
        return name + " - " + managerType + " - " + department;
    }
    
}
