import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][][] house = new int[4][3][10];
		
		int num = sc.nextInt();		
		sc.nextLine(); // Flush

		for (int i = 0; i < num; i++) {
			String[] c = sc.nextLine().split(" ");			
			int b = Integer.parseInt(c[0]) - 1;
			int f = Integer.parseInt(c[1]) - 1;
			int r = Integer.parseInt(c[2]) - 1;
			int v = Integer.parseInt(c[3]);
			
			if ((house[b][f][r] + v) >= 0 && (house[b][f][r] + v) <= 9)
				house[b][f][r] += v;	
		}

		for (int i = 0; i < house.length; i++) {
			for (int j = 0; j < house[i].length; j++) {
				for (int k = 0; k <house[i][j].length; k++)
					System.out.print(" " + house[i][j][k]);
				System.out.println();
			}
			if (i != house.length - 1) System.out.println("####################");
		}	

	}
}
