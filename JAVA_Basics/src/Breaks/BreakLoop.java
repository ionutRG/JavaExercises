package Breaks;

public class BreakLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Entered for loop; i <= 100, and i = " + i);
            if (i == 50) {
                System.out.println("Entered if; i == 50, and i = " + i);
                break;
            }
            System.out.println("Final print " + i);
        }
    }
}
