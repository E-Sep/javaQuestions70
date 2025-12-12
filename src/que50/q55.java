package que50;

import java.util.Random;

public class q55 {
    public static void main(String[] args) {
        int[] lst = new int[70];
        int counter = 0;
        Random random = new Random();
        for(int i = 0; i < lst.length; i++){
            lst[i] = random.nextInt(39 ,50);
            System.out.print(lst[i] + " ");
        }
        System.out.print("\npalaces 49 shown: ");
        for (int i = 0; i < 70; i++) {
            if(lst[i] == 49){
                counter++;
                System.out.print(i + " ");
            }
        }
        System.out.println("\n49 showed " +counter + " times");
    }
}
