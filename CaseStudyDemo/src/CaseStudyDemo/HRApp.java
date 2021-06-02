package CaseStudyDemo;

public class HRApp {

    public static void main(String[] args) {
        System.out.println("HR app has started!");

        Employee e1 = new Employee(101, "John", 1000.00);
        Employee e2 = new Employee(102, "Jane", 1250.25);

        System.out.println("Employees are:\n" + e1 + "\n" + e2);

    }
}
