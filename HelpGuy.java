import java.util.*;
public class HelpGuy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int sum1=0, sum2, max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++)
        {
            sum1 = 0;
            sum2 = 0;
            for(int j = i; j < n; j++)
            {
                sum1 += arr[j];
                sum2 += sum1 + (y*(j-i+1)/x);
                if (sum2 > max)
                    max = sum2;
            }
        }
        System.out.println(max);
        sc.close();
    }
}
