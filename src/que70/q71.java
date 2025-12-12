package que70;

public class q71 {
    public static void main(String[] args) {
        int bag , tmp = 0;
        int start = 1;
        while (start <= 2000) {
            System.out.print(start + " ");
            bag = start;
            start += tmp ;
            tmp = bag;
        }


    }
}
