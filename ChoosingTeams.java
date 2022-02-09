import java.util.*;
public class ChoosingTeams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
            arr[i] += k;
        }
        int count = 0;
        for (int i = 0; i < n; i++)
        {
            if (arr[i] <= 5)
                count++;
        }
        System.out.println(count/3);
        sc.close();
    }
}
