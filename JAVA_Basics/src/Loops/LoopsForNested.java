package Loops;

public class LoopsForNested {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i = i +1){

            for (int j = i; j <= 5; j++){
                System.out.println(i + " " + j);
//                break;
            }
        }
    }
}
