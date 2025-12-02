package que10;
import static java.lang.Math.sqrt;
public class q3 {
    public static void main(String[] args){
        for (int i = 1; i < 20; i++) {
            System.out.print(i+ " ");
            System.out.print(i*i+ " ");
            System.out.print(i*i*i + " ");
            System.out.println(sqrt(i) );
        }
    }
}
