package que40;

import java.util.Scanner;

public class q47 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter 2 numbers A and B");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c;

        if(a == 0){
            if(b == 0) c = 1;
            else if (b > 0 ) c = 2;
            else c = 4;
        }
        else if (a > 0) {
            if(b == 0) c = 2;
            else if (b > 0 ) c = 1;
            else c = 6;
        }
        else{
            if(b == 0) c = 3;
            else if (b > 0 ) c = 5;
            else c = 1;
        }

        System.out.println(" " + a + " _ " + b + " _ " + c);
    }
}
