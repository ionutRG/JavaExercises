package CaseStudyDemo;

import java.util.Arrays;

public class HRApp {

    public static void main(String[] args) {
        System.out.println("HR app has started!");

        //employee object initialization and declaration using constructor
        Employee e1 = new Employee(101, "John Smith", 1000.00);
        Employee e2 = new Employee(102, "Jane Smith", 1250.25);
        Employee e3 = new Employee(103, "Dan Smith", 2500.50);
        Employee e4 = new Employee(104, "John Doe", 2350.35);
        Employee e5 = new Employee(105, "Jane Doe", 3650.65);
        Employee e6 = new Employee(106, "Dan Doe", 4950.95);
        Employee e7 = new Employee(107, "John Ellis", 2350.35);
        Employee e8 = new Employee(108, "Jane Ellis", 2850.85);
        Employee e9 = new Employee(109, "Dan Ellis", 2450.45);
        Employee e10 = new Employee(110, "John Webb", 2650.35);
        Employee e11 = new Employee(111, "James Webb", 5750.15);
        Employee e12 = new Employee(112, "Jenna Webb", 8650.95);
        Employee[] employeeList ={
                new Employee(113, "John Smith", 1350.35),
                new Employee(114, "Janice Smith", 1250.25),
        };
        Employee e15 = new Employee(115, "@ many emps", 99999.99);


        //department set (here acc = Accounting dept) with constructor
        Department acc = new Department("Accounting");
        Department hr = new Department("Human Resources - HR");
        Department rnd = new Department("Research & Development - R&D");
        //department set with setDepartmentName method

            acc.addEmployee(e1);
            acc.addEmployee(e2);
            acc.addEmployee(e3);
            acc.addEmployee(e4);
            acc.addEmployee(e5);
            acc.addEmployee(e6);
            acc.addEmployee(e7);
            acc.addEmployee(e8);
            acc.addEmployee(e9);
            hr.addEmployee(e10);
            hr.addEmployee(new Employee(116, "way too many emps!", 0.99));
            rnd.addEmployee(e11);
            rnd.addEmployee(e12);
            rnd.addEmployee(e15);


//            acc.addEmployeeFromList(employeeList);

        System.out.println("\nDepartment: " + acc.getDepartmentName() +
                "\nhas: " + acc.getEmployeeCount() + " employees" +
                "\nList of employees from department is:\n" + acc.getEmployeeList() +
                "\nDepartment has a total salary of: " + acc.getDepartmentTotalSalary() +
                "\nDepartment has an average salary/employee of: " + acc.getDepartmentAverageSalary());

        System.out.println("\nDepartment: " + hr.getDepartmentName() +
                "\nhas: " + hr.getEmployeeCount() + " employees" +
                "\nList of employees from department is:\n" + hr.getEmployeeList() +
                "\nDepartment has a total salary of: " + hr.getDepartmentTotalSalary() +
                "\nDepartment has an average salary/employee fo: " + hr.getDepartmentAverageSalary());

        System.out.println("\nDepartment: " + rnd.getDepartmentName() +
                "\nhas: " + rnd.getEmployeeCount() + " employees" +
                "\nList of employees from department is:\n" + Arrays.toString(rnd.getEmployeeList())+
                "\nDepartment has a total salary of: " + rnd.getDepartmentTotalSalary() +
                "\nDepartment has an average salary/employee fo: " + rnd.getDepartmentAverageSalary());

        System.out.println("\nGet employee from id:\n" + rnd.getEmployeeById(1231243));
    }
}
