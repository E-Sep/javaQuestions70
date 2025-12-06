package que10;

import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter 2 numbers A and B");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        if(a%b == 0){
            System.out.println( a + " is dividable by " + b);
        }
        else System.out.println( a + " is not dividable by " + b);
        }
}

