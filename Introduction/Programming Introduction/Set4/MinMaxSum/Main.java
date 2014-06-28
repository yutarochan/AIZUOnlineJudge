import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int[] arr = new int[sc.nextInt()];
    	int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			int num = sc.nextInt();
			arr[i] = num;
			sum += num;
		}
		Arrays.sort(arr);

		System.out.println(arr[0] + " " + arr[arr.length-1] + " " + sum);
    }
}