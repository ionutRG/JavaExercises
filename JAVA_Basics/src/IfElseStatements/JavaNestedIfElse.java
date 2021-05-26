package IfElseStatements;

public class JavaNestedIfElse {
    public static void main(String[] args) {
        int age = 19;
        int minAge = 18;
        int weight = 45;
        int minWeight = 50;
        if (age >= minAge) {
            if (weight > minWeight) {
                System.out.println("You can donate blood!");
            }
            else {
                System.out.println("You can't donate blood! Weight is less than the minimum of " + minWeight + " kg!");
            }
        }
        else {
            System.out.println("You can't donate blood! Age is less than minimum of " + minAge + " years old!");
        }
    }
}
