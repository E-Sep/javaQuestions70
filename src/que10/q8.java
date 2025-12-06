package que10;

import java.util.ArrayList;
import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter 2 numbers A and B");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();

        int result=0;
        for (int i = 1; i <= a; i++) {
            if(a%i == 0){
                list1.add(i);
            }
        }
        for (int i = 1; i <= b; i++) {
            if(b%i == 0){
                list2.add(i);
            }
        }
        for(int x: list1) {System.out.print(x + " ");}
        System.out.println();
        for(int x: list2) {System.out.print(x + " ");}

        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size() ; j++) {
                if(list1.get(i) == list2.get(j)){
                    result = list1.get(i);
                }
            }
        }
        System.out.println("\nب.م.م= " + result);




    }
}
