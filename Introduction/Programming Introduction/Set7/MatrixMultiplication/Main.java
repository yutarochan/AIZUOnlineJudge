import java.io.*;
import java.util.*;
import java.math.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n, m, l;
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		l = Integer.parseInt(st.nextToken());

		BigInteger[][] m1 = new BigInteger[n][m];
		for (int i = 0; i < n; i++) {
			StringTokenizer s = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++)
				m1[i][j] = new BigInteger(s.nextToken());
		}

		BigInteger[][] m2 = new BigInteger[m][l];		
		for (int i = 0; i < m; i++) {
			StringTokenizer s = new StringTokenizer(br.readLine());
			for (int j = 0; j < l; j++)
				m2[i][j] = new BigInteger(s.nextToken()); 
		}

		BigInteger[][] ans = new BigInteger[n][l];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < l; j++)
				for (int k = 0; k < m; k++) {
					BigInteger n1 = new BigInteger(m1[i][k].toString());										
					BigInteger n2 = new BigInteger(m2[k][j].toString());
					if (ans[i][j] == null) ans[i][j] = new BigInteger("0");
					
					ans[i][j] = ans[i][j].add(n1.multiply(n2));
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < l; j++) {
				System.out.print(ans[i][j].toString());
				if (j != l - 1) System.out.print(" ");
			}			
			System.out.println();
		}
	}
}
