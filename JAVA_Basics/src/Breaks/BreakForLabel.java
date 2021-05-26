package Breaks;

public class BreakForLabel {
    public static void main(String[] args) {
        FirstForLoop:
            for (int i = 1; i <= 3; i++ ) {
                System.out.println("ENTER 1st for loop with i = " + i);
                SecondForLoop:
                    for (int j = 1; j <= 3; j++) {
                        System.out.println("ENTER 2nd for loop with i and j = " + i + " " + j);
                        if (i == 3 && j == 1) {
                            System.out.println("      ***ENTER if with i and j = " + i + " " + j);
                            break FirstForLoop;
                        }
                        else {
                            System.out.println("      ***EXIT if with i and j = " + i + " " + j);
                        }
//                        System.out.println("i = " + i + ", j = " + j);
                    }
            }
    }
}
