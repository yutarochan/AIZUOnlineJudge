import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] cards = new int[4][13];
		
		int card_num = sc.nextInt();
		sc.nextLine(); // Flush

		for (int i = 0; i < card_num; i++) {
			String[] c = sc.nextLine().split(" ");
			int num = Integer.parseInt(c[1]);
			
			if (c[0].equals("S")) cards[0][Integer.parseInt(c[1]) - 1] = 1;
			else if (c[0].equals("H")) cards[1][Integer.parseInt(c[1]) - 1] = 1;
			else if (c[0].equals("C")) cards[2][Integer.parseInt(c[1]) - 1] = 1;
			else if (c[0].equals("D")) cards[3][Integer.parseInt(c[1]) - 1] = 1;
		}

		for (int i = 0; i < cards.length; i++) {
			for (int j = 0; j < cards[i].length; j++) {
				if (cards[i][j] == 0) {	
					if (i==0) System.out.print("S");
					else if (i==1) System.out.print("H");
					else if (i==2) System.out.print("C");
					else if (i==3) System.out.print("D");

					System.out.println(" " + (j+1)); 
				}
			}
		}	

	}
}
