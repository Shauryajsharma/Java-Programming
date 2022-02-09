import java.util.*;
public class ReqRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int n = sc.nextInt();
            int p = n/x;
            int ans = x*p + y;
            if (ans > n)
            {
                ans -= x;
            }System.out.println(ans);
        }
        sc.close();
    }
}
