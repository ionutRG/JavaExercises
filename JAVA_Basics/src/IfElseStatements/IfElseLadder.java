package IfElseStatements;

public class IfElseLadder {
    public static void main(String[] args) {
        int grade = 12345;

        if (grade < 50 && grade > 0){
            System.out.println("Failed");
        }
        else if (grade >= 50 && grade < 60){
            System.out.println("E grade");
        }
        else if (grade >= 60 && grade < 70){
            System.out.println("D grade");
        }
        else if (grade >= 70 && grade < 80){
            System.out.println("C grade");
        }
        else if (grade >= 80 && grade < 90){
            System.out.println("B grade");
        }
        else if (grade >= 90 && grade < 100){
            System.out.println("A grade");
        }
        else if (grade == 100){
            System.out.println("A+ grade");
        }
        else {
            System.out.println("Grade out of bounds!");
        }
    }
}
