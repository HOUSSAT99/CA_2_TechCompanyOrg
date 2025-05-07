package CA_2;

public class Employee {
    private String name;
    private DepartmentName department;
    private ManagerType managerType;

    public Employee(String name, ManagerType managerType, DepartmentName department) {
        this.name = name;
        this.department = department;
        this.managerType = managerType;
    }

    public String getName() {
        return name;
    }

    public DepartmentName getDepartment() {
        return department;
    }

    public ManagerType getManagerType() {
        return managerType;
    }

    public int compareByName(String otherName) {
        return this.name.compareToIgnoreCase(otherName);
    }

    @Override
public String toString() {
    return name + " | Manager Type: " + managerType + " | Department: " + department;
}

}
