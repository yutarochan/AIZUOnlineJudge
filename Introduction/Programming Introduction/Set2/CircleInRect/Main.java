import java.util.Scanner;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int width = sc.nextInt();
        int height = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int r = sc.nextInt();
 
        if ((x >= r) &&  (y >= r) && ((width-r) >= x) && ((height-r) >= y)) System.out.println("Yes");
        else System.out.println("No");
    }
   
}