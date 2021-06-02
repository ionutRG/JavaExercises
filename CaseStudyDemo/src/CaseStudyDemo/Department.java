package CaseStudyDemo;

public class Department {
    private String departmentName;
    private Employee[] employees = new Employee[10];
    private int empIndex = -1;
    private double totalSalary = 0.0;
    private int empCounter = 0;

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return getDepartmentName();
    }

    public void addEmployees(Employee anEmployee) {
        if (empIndex < employees.length) {
            empIndex++;
            employees[empIndex] = anEmployee;
        }
    }

    public Employee[] getEmployeeList() {
        Employee[] actualEmployeeList = new Employee[empIndex + 1];
        for (int i = 0; i < actualEmployeeList.length; i++) {
            actualEmployeeList[i] = employees[i];
        }
        return actualEmployeeList;
    }

    public int getEmployeeCount() {
        return empIndex + 1;
    }

    public Employee getEmployeeFromId(int empId) {
        for (Employee emp : employees) {
            if (emp.getEmployeeId() == empId) {
                return emp;
            }
        }
        return null;
    }

    public double getTotalSalary() {
        for (Employee emp : employees) {
            totalSalary = totalSalary + emp.getEmployeeSalary();
            empCounter++;
        }
        return totalSalary;
    }

    public double getAverageSalary() {
        double averageSalary = totalSalary / empCounter;
        return averageSalary;
    }


}
