package que30;

import static java.lang.Math.sqrt;

public class q22 {
    public static void main(String[] args) {

        for (int i = 1000; i < 10000; i++) {
            int a = i / 100;
            int b = i % 100;

            if (a - b == 25 && sqrt_check(i)){
                System.out.print(i + " ");
            }

        }
    }

    public static boolean sqrt_check(int num){
        boolean flag = false;
        // sqrt(10000) = 100 , sqrt(100) ~= 31
        for (int i = 31; i < 100; i++) {
            if ( i*i == num) {
                flag = true;
                //System.out.println(i);
                break;
            }
        }
        return flag;
    }
}
