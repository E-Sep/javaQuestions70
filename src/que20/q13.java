package que20;

public class q13 {
    public static void main(String[] args) {

        for (int i = 100; i < 1000; i++) {
            int sad = i / 100;
            int dah = (i % 100) / 10;
            int yek = i % 10 ;
            //System.out.println(sad + " " + dah + " " + yek);
            int rsl = sad*sad*sad + dah*dah*dah + yek*yek*yek;
            if (rsl == i) {
                System.out.print(i + " ");
            }
        }
    }
}
