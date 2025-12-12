package que50;

import java.util.Random;

public class q52 {
    public static void main(String[] args) {
        Random random=new Random();
        int num;
        int max=0;
        for (int i = 0; i < 50; i++) {
            num = random.nextInt(100);
            System.out.print(num + " ");
            if (max < num ) {
                max = num;
            }
        }
        System.out.println("\nmaximum number in loop is "+ max);
    }
}
