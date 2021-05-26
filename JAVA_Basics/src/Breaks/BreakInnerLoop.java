package Breaks;

public class BreakInnerLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Entered 1st for loop with i = " + i);
            for (int j = 1; j <= 3; j++) {
                System.out.println("  Entered 2nd for loop with i = " + i + " and j = " + j);
                if (i == 3 && j == 2) {
                    System.out.println("****Entered if with i = " +i + " and j =  " + j);
                    break;
                }
                else {
                    System.out.println("EXIT If with i = " + i + " and j = " + j);
                }
            }
        }
    }
}
