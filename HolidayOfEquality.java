import java.util.*;
public class HolidayOfEquality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int sum = 0;
        int max = arr[n-1];
        for (int i = 0; i < n-1; i++)
        {
            sum += (max-arr[i]);
        }
        System.out.println(sum);
        sc.close();
    }
}
