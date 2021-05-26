package IfElseStatements;

public class LeapYearChecker {
    public static void main(String[] args) {
        String isLeapYear = "a leap year";
        String isNotLeapYear = "not a leap year";
        int year = 2002;
        if ((year % 4 == 0) || (year % 400 == 0) && (year % 100 != 0)) {
            System.out.println("Year: " + year + " is " + isLeapYear);
        }
        else {
            System.out.println("Year: " + year + " is " + isNotLeapYear);
        }
    }
}
