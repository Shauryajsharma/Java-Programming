import java.util.*;
public class PolycarpCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0)
        {
            int n = sc.nextInt();
            int a = n/3;
            if ((2*a + a) == n)
                System.out.println(a + " " + a);
            else if ((a+1)*2 + (a) == n)
                System.out.println(a + " " + (a+1));
            else if (a*2 + (a+1) == n)
                System.out.println((a+1) + " " + a);
        }
        sc.close();
    }
}
