import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
 
        int[][] arr = new int[r + 1][c + 1];
        for (int i = 0; i < r; i++) {
            int sum = 0;
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
                sum += arr[i][j];
            }
            arr[i][c] = sum;
        }
 
        for (int i = 0; i < c; i++) {
            int sum = 0;
            for (int j = 0; j < r; j++) {
                sum += arr[j][i];
            }
            arr[r][i] = sum;
        }
 
        int total = 0;
        for (int i = 0; i < r; i++) total += arr[i][c];
        arr[r][c] = total;
 
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
                if (j != arr[i].length -1) System.out.print(" ");
            }
            System.out.println();
        }
    }
}
