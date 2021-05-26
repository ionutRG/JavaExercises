package W3SchoolExercises;//public class W3SchoolExercises.Main {
//    static void myMethod(String fname, int age) {
//        System.out.println("Hello world " + fname + " and has age: " + age);
//    }
//    public static void main(String[] args) {
//        myMethod("Adam", 5);
//        myMethod("Eve", 10);
//        myMethod("snake", 9001);
//    }
//}

//public class W3SchoolExercises.Main {
//    static double myMethod(double x, double y) {
//        return y + x;
//    }
//    public static void main(String[] args) {
//        System.out.println(myMethod(10.3, 23.5));
//    }
//}

//public class W3SchoolExercises.Main {
//    static int myMethod(int x, int y) {
//        return x + y;
//    }
//
//    public static void main(String[] args) {
//        int z = myMethod(4, 5);
//        System.out.println("Sum of x,y is: " + z);
//    }
//}

//public class W3SchoolExercises.Main {
//
//    static boolean checkAge(int age) {
//        if (age < 18) return true;
//        else return false;
//    }
//    public static void main(String[] args) {
//        if (checkAge(19)) {
//            System.out.println("you are under 18!");
//            System.out.println("asdasd");
//        } else System.out.println("you are over 18!");
//    }
//}

//    public class W3SchoolExercises.Main {
//
//        int myMethod(int x) {
//            return 0;
//        }
//        float myMethod(float x) {
//            return 0;
//        }
//        double myMethod(double x, double y) {
//            return 0;
//        }
//
//        static int plusMethodInt(int x, int y) {
//        return x + y;
//    }
//
//        static double plusMethodDouble(double x, double y) {
//        return x + y;
//    }
//
//        public static void main(String[] args) {
//            int myNum1 = plusMethodInt(8, 9);
//            double myNum2 = plusMethodDouble(4.14, 7.86);
//            System.out.println("integer/int: " + myNum1);
//            System.out.println("double: " + myNum2);
//        }
//}


    public class Main {
    int myMethod(int x) {
        return 0;
    }
    float myMethod(float x) {
        return 0;
    }
    double myMethod(double x, double y) {
        return 0;
    }
    static int plusMethod(int x, int y) {
        return x + y;
    }
    static float plusMethod(float x, float y) {
        return x + y;
    }

    public static void main(String[] args) {
        int myNum1 = plusMethod(8, 10);
        float myNum2 = plusMethod(7.14f, 8.86f);
        System.out.println("integer/int: " + myNum1);
        System.out.println("double: " + myNum2);
    }
}
