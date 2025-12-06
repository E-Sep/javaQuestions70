package que10;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.random;

public class q1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int[] ls = new int[100];
        for (int j = 0; j < 100; j++) {
            ls[j] = random.nextInt(10);
            //ls[j] = scanner.nextInt();
        }

        for (int x : ls) {
            System.out.print(x + " ");
        }

        int even_counter = 0;
        int odd_sum = 0;

        for (int i = 0; i < 100; i++) {
            if (ls[i] == 0) continue;
            else if (ls[i] % 2 == 0) even_counter++;
            else odd_sum += ls[i];
        }

        System.out.println("\neven_counter = " + even_counter);
        System.out.println("odd_sum = " + odd_sum);

    }
}