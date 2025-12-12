package que30;

public class q21 {
    public static void main(String[] args) {
        for (int i = 1000; i < 10000; i++) {
            int a = i / 100;
            int b = i % 100;
            int c = a+b;
            if (i == c*c){
                System.out.print(i + " ");
            }

        }
    }
}
