package que20;

import java.util.ArrayList;
import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        try {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter two digit numbers:");
        int n ,m;
        int[] lst1 = new int[100];
        int[] lst2 = new int[100];
        int i=0;

            do {
                n=scanner.nextInt();
                m=scanner.nextInt();
                int fnfd = n % 10;  //first number first digit
                int fnsd = n / 10;
                int snfd = m % 10;
                int snsd = m / 10;
                if(fnfd == snsd && fnsd == snfd) {
                    //System.out.println(n + "," + m);
                    lst1[i]=n;
                    lst2[i]=m;
                    i++;
                }
            }while (n > 0 && m > 0);


            for(int j = 0 ; j < lst1.length ; j++) {
                if (lst1[j] == 0 && lst2[j] == 0) break;
                else System.out.print(lst1[j] + " , " + lst2[j] + " _ ");
            }



        } catch (Exception e) {
            System.out.println("Number definition wasn't correct!!");
            throw new RuntimeException(e);
        }

    }
}
