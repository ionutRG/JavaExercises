package Switches;

public class NestedSwitch {
    public static void main(String[] args) {
        char branch = 'C';
        int collegeYear =  3;

        switch (collegeYear){
            case 1: System.out.println("English, Maths, Science");
                break;
            case 2: System.out.println("Spanish, French, Poetry");
                break;
            case 3:
                switch (branch){
                    case 'A': System.out.println("Operating System, Java, Data Structure");
                        break;
                    case 'B': System.out.println("Micro processors, Logic switching theory");
                        break;
                    case 'C': System.out.println("Drawing, Manufacturing Machines");
                        break;
                    default: System.out.println("Could not find any classes for the 3rd year!");
                }
                break;
            case 4:
                switch (branch){
                    case 'A': System.out.println("Computer Organization, MultiMedia");
                        break;
                    case 'B': System.out.println("Fundamentals of Logic Design, Microelectronics");
                        break;
                    case 'C': System.out.println("Internal Combustion Engines, Mechanical Vibration");
                        break;
                    default: System.out.println("Could not find any classes for the 4th year!");
                }
                break;
            case 5:
                switch (branch){
                    case 'A': System.out.println("Data Communication and Networks, MultiMedia");
                        break;
                    case 'B': System.out.println("Embedded System, Image Processing");
                        break;
                    case 'C': System.out.println("Production Technology, Thermal Engineering");
                        break;
                    default: System.out.println("Could not find any classes for the 5th year!");
                }
                break;
            default: System.out.println("Could not locate you in any college year!");
        }
    }
}
