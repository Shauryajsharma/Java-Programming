import java.util.*;
public class PhoenixBalance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--!=0)
        {
            int n = sc.nextInt();
            double sum1 = Math.pow(2, n);
            for (int i = 1; i < n/2; i++)
            {
                sum1 += Math.pow(2,i); 
            }
            double sum2 = 0;
            for (int i = n/2; i < n; i++)
            {
                sum2 += Math.pow(2, i);
            }
            int diff = (int) (sum1 - sum2);
            System.out.println(diff);
        }
        sc.close();
    }
}
