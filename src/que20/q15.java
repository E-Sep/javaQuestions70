package que20;

public class q15 {
    public static void main(String[] args) {
        int sum=0;
        for (int i = 100; i < 1000 ; i++) {
            int yek = i % 10 ;
            if(yek == 4){
                System.out.print(i + " ");
                sum+= i;
            }
        }
        System.out.println("\nsimulation : " + sum);
    }
}
