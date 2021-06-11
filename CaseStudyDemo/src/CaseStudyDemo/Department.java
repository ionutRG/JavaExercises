package CaseStudyDemo;

public class Department {
    private String departmentName;
    private Employee[] employees = new Employee[10];
    private int lastEmployeeIndex = -1;

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

    public void addEmployee(Employee anEmployee) {
        if (lastEmployeeIndex < employees.length) {
            lastEmployeeIndex++;
            employees[lastEmployeeIndex] = anEmployee;
        }
//        else {
//            System.out.println("Maximum number of employees per department ("+ employees.length +") has been reached");
//        }
    }

//    public void addEmployeeFromList (Employee[] anotherEmployee) {
//        if (lastEmployeeIndex < employees.length) {
//            lastEmployeeIndex++;
//            employees[lastEmployeeIndex] = anotherEmployee;
//        }
//    }

    public Employee[] getEmployeeList() {
        Employee[] actualEmployeeList = new Employee[lastEmployeeIndex + 1];
        for (int i = 0; i < actualEmployeeList.length; i++) {
            actualEmployeeList[i] = employees[i];
        }
        return actualEmployeeList;
    }

    public int getEmployeeCount() {
        return lastEmployeeIndex + 1;
    }

    public Employee getEmployeeById(int empId) {
        for (Employee emp : employees) {
            if (emp != null) {
                if (emp.getEmployeeId() == empId) {
                    return emp;
                }
            } else {
                System.out.println("Employee ID does not exist in department!");
            }
        }
        return null;
    }

    public double getDepartmentTotalSalary() {
        double totalSalary = 0.0;
        for (Employee empSalary : getEmployeeList()) {
            totalSalary = totalSalary + empSalary.getEmployeeSalary();
        }
        return totalSalary;
    }

    public double getDepartmentAverageSalary() {
        double averageSalary = getDepartmentTotalSalary() / getEmployeeCount();
        return averageSalary;
    }


}
