import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int st = sc.nextInt();
        int end = sc.nextInt();
        int num = sc.nextInt();

        int divCount = 0;

        for (int i = st; i <= end; i++)
            if ((num % i) == 0) divCount++;

        System.out.println(divCount);
    }
}