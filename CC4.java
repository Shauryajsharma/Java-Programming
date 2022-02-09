import java.util.*;
public class CC4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        while(q--!=0)
        {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int sum = 0;
            for (int i = l-1; i < r; i++)
            {
                sum += arr[i];
            }
            System.out.println(sum);
        }
        sc.close();
    }
}
