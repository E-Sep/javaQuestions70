package que20;

public class q20 {
    public static void main(String[] args) {
        for (int i = 1000; i < 10000; i++) {
            int a = i / 1000;
            int b = (i % 1000) / 100;
            int c = (i % 100) / 10;
            int d = i % 10;
            //System.out.println(a + " " + b + " " + c + " " + d);
            if (a + d == b + c){
                System.out.print(i + " ");
            }
        }
    }
}
