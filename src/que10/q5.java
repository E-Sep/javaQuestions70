package que10;

import java.util.Scanner;
import static java.lang.Math.pow;

public class q5 {
    public static void main(String[] args) {
        System.out.print("Enter a positive integer: " );
        Scanner scanner= new Scanner(System.in);
        int num = scanner.nextInt();

        int sum = num*(num + 1)/2;
        System.out.println("Sum of 1 to "+num+" = "+sum);

        int sumsum = num*(num + 1)*(num*2 + 1)/6;
        System.out.println("Sum of 2*power 1 to "+ num+" = "+ sumsum);

        double sumsumsum = pow(num,2)* pow((num + 1),2)/4 ;
        System.out.println("Sum of 3*power 1 to "+ num+" = "+ sumsumsum);



    }
}
