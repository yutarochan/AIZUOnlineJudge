import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	ArrayList<Integer> a1 = new ArrayList<Integer>();
        ArrayList<Integer> a2 = new ArrayList<Integer>();

    	while (sc.hasNextInt()) {
            int i = sc.nextInt();
            int j = sc.nextInt();

            if (i == 0 && j == 0) break;
            
            a1.add(i);
            a2.add(j);
    	}

    	for (int i = 0; i < a1.size(); i++) {
            if (a1.get(i) > a2.get(i)) swap(a1, a2, i);
            System.out.println(a1.get(i) + " " + a2.get(i));
        }
    }

    public static void swap(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int idx) {
        int temp = arr1.get(idx);
        arr1.set(idx, arr2.get(idx));
        arr2.set(idx, temp);
    }
}