import java.util.*;
public class AnotherTwoIntProb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--!=0)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a == b)
            {
                System.out.println(0);
                continue;
            }
            int max = Math.max(a, b);
            int min = Math.min(a, b);
            int ct = 0;
            while(max-min > 9)
            {
                max -= 10;
                ct++;
            }
            if (max-min == 0)
                System.out.println(ct);
            else
                System.out.println(ct+1);
        }
        sc.close();
    }
}
