import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	
		sc.nextLine(); // Flush
		
		String data = sc.nextLine();
		String[] arr = data.split(" ");

		for (int i = arr.length - 1; i >= 0; i--) {			
			System.out.print(arr[i]);
			if (i != 0) System.out.print(" "); 
		}
		System.out.println();
	}
}

