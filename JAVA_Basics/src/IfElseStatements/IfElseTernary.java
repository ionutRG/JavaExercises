package IfElseStatements;

public class IfElseTernary {
    public static void main(String[] args) {
        int number = 16;
        String output = (number % 2 == 0)?"Statement is true, "+ number + " is even! ":"Statement is NOT true, " + number + " is odd!";
        System.out.println(output);
    }
}
