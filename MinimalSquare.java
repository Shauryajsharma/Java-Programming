import java.util.*;
public class MinimalSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0)
        {
            double a = sc.nextInt();
            double b = sc.nextInt();
            double min = Math.min(Math.max(2*a,b), Math.max(2*b,a));
            System.out.println(min);            
        }
        sc.close();
    }
}
