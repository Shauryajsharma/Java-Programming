import java.util.*;
public class PoliceRecruits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int off = 0;
        for (int i = 0; i < n; i++)
        {
            int p = sc.nextInt();
            if (p>0)
            {
                sum += p;
            }
            else if (p<0)
            {
                if (sum > 0)
                {
                    sum += p;
                }
                else
                {
                    off++;
                }
            }
        }
        System.out.println(off);
        sc.close();
    }
}
