package que10;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args){

        System.out.print("Enter a positive integer: " );
        Scanner scanner= new Scanner(System.in);
        int number;
        int power_sum=0;

        do {
            number = scanner.nextInt();
        }while (number <= 0);

        System.out.print(number+ "^"+2 + "= ");
        for (int i = 0; i <= number*2; i++) {
            if ((i%2!=0)){
                System.out.print(i + "+");
                power_sum+=i;
            }
        }
        System.out.println(" = " +power_sum);

    }
}
