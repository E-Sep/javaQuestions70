package que10;

public class q10 {
    public static void main(String[] args) {
        int simulation = 0;
        int count_value = 0;
        for (int i = 1; i <= 300; i++) {
            if(i%3==0 && i%7==0){
                simulation+= i;
                count_value++;
                System.out.print(i + " ");
            }
        }
        System.out.println("\nsimulation = " + simulation);
        System.out.println("count_value = " + count_value);

    }
}
