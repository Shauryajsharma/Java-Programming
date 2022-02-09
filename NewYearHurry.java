import java.util.*;
public class NewYearHurry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int k = 240 - p;
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= n; i++)
        {
            sum += 5*i;
            if (sum <= k)
            count++;
            else
            break;
        }
        System.out.println(count);
        sc.close();
    }
}
