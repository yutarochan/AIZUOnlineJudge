import java.util.ArrayList;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> height = new ArrayList<Integer>();
        ArrayList<Integer> width = new ArrayList<Integer>();
         
        while (sc.hasNextInt()) {
            int h = sc.nextInt();
            int w = sc.nextInt();
             
            if (h == 0) break;
             
            height.add(h);
            width.add(w);
        }
         
        for (int x = 0; x < height.size(); x++) {
            for (int i = 0; i < height.get(x); i++) {
                for (int j = 0; j < width.get(x); j++) System.out.print("#");
                System.out.println();
            }
            System.out.println();
        }
    }
}
