import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String text = br.readLine();

		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) > 64 && text.charAt(i) < 91)
				System.out.print((char) (text.charAt(i) + 32));			
			else if (text.charAt(i) > 96 && text.charAt(i) < 124)
				System.out.print((char) (text.charAt(i) - 32));			
			else
				System.out.print(text.charAt(i));				
		}
		System.out.println();
	}
}
