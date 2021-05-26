package Loops;

public class LoopsForLabels {
    public static void main(String[] args) {
// for loop label name does not accept digits as first char, will ignore it when breaking
        firstLoop:
            for (int i = 1; i <= 4; i++) {
                secondLoop:
                for (int j = 1; j <= 4; j++) {
                    if ( i == 2 && j == 3){
                        break secondLoop;
                    }
                    System.out.println(i + " " + j);
                }
            }
    }
}
