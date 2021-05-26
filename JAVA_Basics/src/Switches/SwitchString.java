package Switches;

public class SwitchString {
    public static void main(String[] args) {
        String levelString = "Noob";
        int levelInt = 3;

        switch (levelString) {
            case "Noob": levelInt = 1;
            break;
            case "Inter": levelInt = 2;
                break;
            case "Adv": levelInt = 3;
                break;
            default: levelInt = 0;
        }
        System.out.println("Your level is: " + levelInt);
    }
}
