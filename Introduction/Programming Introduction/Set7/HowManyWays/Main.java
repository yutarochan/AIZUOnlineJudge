import java.util.Scanner;
import java.util.ArrayList;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> data = new ArrayList<String>();       
     
        while (true) {
            String in = sc.nextLine();
            if (!in.equals("0 0")) data.add(in);
            else break;
        }
     
        int[] count = new int[data.size()];
 
        for (int i = 0; i < data.size(); i++) {
            int max = Integer.parseInt(data.get(i).split(" ")[0]);
            int tot = Integer.parseInt(data.get(i).split(" ")[1]);
             
            for (int x = 1; x <= max; x++) {
                for (int y = x+1; y <= max; y++) {
                    for (int z = y+1; z <= max; z++) {
                        if ((x + y + z) == tot) count[i]++;
                    }
                }
            }
        }
 
        for (int i : count) System.out.println(i);
    }       
}
