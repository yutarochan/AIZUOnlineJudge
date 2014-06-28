import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 		double r = sc.nextDouble();

 		System.out.printf("%1$.6f ", Math.PI*(r*r));
 		System.out.printf("%1$.6f\n", Math.PI*(2*r));
    }
}