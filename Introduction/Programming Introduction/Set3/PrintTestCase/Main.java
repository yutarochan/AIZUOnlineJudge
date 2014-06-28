import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	ArrayList<Integer> arr = new ArrayList<Integer>();

    	while (sc.hasNextInt()) {
    		int i = sc.nextInt();
    		if (i == 0) break;
    		else arr.add(i);
    	}

    	for (int i = 0; i < arr.size(); i++)
    		System.out.println("Case " + (i+1) + ": " + arr.get(i));
    }   
}