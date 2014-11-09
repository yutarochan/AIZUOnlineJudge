import java.util.Scanner;
import java.util.ArrayList;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> grades = new ArrayList<String>();
 
        while (true) {
            int m = sc.nextInt();
            int f = sc.nextInt();
            int r = sc.nextInt();
            if (m == -1 && f == -1 && r == -1) break;
             
 
            if ((m + f) >= 80) grades.add("A");
            else if ((m + f) >= 65 && (m + f) < 80) grades.add("B");
            else if ((m + f) >= 50 && (m + f) < 65) grades.add("C");
            else if ((m + f) >= 30 && (m + f) < 50) {
                if (r >= 50) grades.add("C");
                else if (m == -1 || f == -1) grades.add("F");               
                else grades.add("D");
            } else if ((m + f) <= 30) grades.add("F");
        }
         
        for (String s : grades)
            System.out.println(s);
    }
}
