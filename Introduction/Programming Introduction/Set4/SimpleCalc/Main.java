import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> ans = new ArrayList<Integer>();

		String data = null;
		while ((data = br.readLine()) != null) {
			String[] num = data.split(" ");
			int i = Integer.parseInt(num[0]);
			String operation = num[1];
			int j = Integer.parseInt(num[2]);
			
			if (operation.equals("?")) break;
			
			if (operation.equals("+")) ans.add(i + j);
			else if (operation.equals("-")) ans.add(i - j);
			else if (operation.equals("*")) ans.add(i * j);
			else if (operation.equals("/")) ans.add(i / j);
		}

		for (int i = 0; i < ans.size(); i++) System.out.println(ans.get(i));
    }
}