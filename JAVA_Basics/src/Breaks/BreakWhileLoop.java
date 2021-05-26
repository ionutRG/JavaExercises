package Breaks;

public class BreakWhileLoop {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            System.out.println("ENTER while loop with i = " + i);
            if (i == 5) {
                System.out.println("ENTER if with i = " + i);
                i++;
                System.out.println("i++ =  " + i);
                break;
            }
            System.out.println("i is: " + i);
            i++;
            System.out.println("i++ is: " + i);
        }
    }
}
