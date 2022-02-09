import java.util.*;
public class IntSeq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0)
        {
            int k = sc.nextInt();
            for (int i = 1; i <= k; i++)
            {
                if (Math.pow(2,i) == k)
                {
                    System.out.println(k);
                    break;
                }
            }
        }
        sc.close();
    }
}
