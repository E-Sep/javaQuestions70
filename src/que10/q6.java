package que10;

import java.util.Scanner;
import static java.lang.Math.*;

public class q6 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Enter number ");
        int n;
        do {
            n =  scanner.nextInt();
        }while (n < 5);

        double stirling_fact = exp(-n)*pow(n,n)*sqrt(2*PI*n);
        System.out.println("Stirling Factorial of "+n+" is "+ (float)stirling_fact);

        double forsyth_fact = sqrt(2*PI)*(sqrt((pow(n,2)))+ 0.166 )/ E;
        System.out.println("Forsyth Factorial of "+n+" is "+ (float)forsyth_fact);


    }
}
