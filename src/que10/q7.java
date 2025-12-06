package que10;

import java.util.Scanner;

import static java.lang.Math.pow;

public class q7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter 5 numbers ");
 //       int[] nums =new int[5];
//        for (int i = 0; i < 5; i++) {
//            nums[i] = scanner.nextInt();
//        }
        int[] nums = {3, 5, 7, 1, 2};
        float geometric_mean = 0;
        float mult_result = 1;
        for (int i = 0; i < 5; i++) {
            mult_result *= nums[i];
        }
        System.out.println("mult_result is "+mult_result);
        geometric_mean = (float) pow(mult_result, (float)1/5);
        System.out.println("geometric_mean is "+geometric_mean);




    }
}
