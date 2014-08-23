import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.nextLine(); // Flush

		int[][] arr = new int[n][m];

		for (int i = 0 ; i < n; i++) {
			String[] data = sc.nextLine().split(" ");
			for (int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(data[j]);
			}
		}

		int[] b = new int[m];
		for (int i = 0; i < m; i++) b[i] = sc.nextInt();

		int[] total = new int[n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				total[i] += arr[i][j] * b[j]; 
			}
		}

		for (int i = 0; i < total.length; i++)
			System.out.println(total[i]);

	}	
}
