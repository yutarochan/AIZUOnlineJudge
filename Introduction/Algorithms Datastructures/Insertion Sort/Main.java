import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[sc.nextInt()];
		for (int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();

		insertSort(arr);
	}

	public static void printArr(int[] arr) {
		for (int a : arr) System.out.print(a + " ");
		System.out.print("\n");
	}

	public static void insertSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j;
			for (j = i - 1; (j >= 0) && key < arr[j]; j--)
				arr[j+1] = arr[j];
			arr[j+1] = key;

			printArr(arr);
		}
	}
}