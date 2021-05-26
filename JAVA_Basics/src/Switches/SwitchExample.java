package Switches;

public class SwitchExample {
    public static void main(String[] args) {
        int number = 10;
        switch (number){
            case 10: System.out.println("Number is 10");
                break;
            case 20: System.out.println("Number is 20");
                break;
            case 30: System.out.println("Number is 30");
                break;
            default: System.out.println("Not in 10, 20, 30");
        }
    }
}
