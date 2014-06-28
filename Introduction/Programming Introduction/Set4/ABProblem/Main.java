import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print((a/b) + " " + (a%b) + " ");
        System.out.printf("%1$.6f\n", ((double)a/(double)b));
    }
}