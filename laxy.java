import java.util.*;
public class laxy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int sum = arr[k-1];
        for (int i = k-1; i >= 1; i--)
        {
            sum += Math.abs(arr[i]-arr[i-1]);
        }
        System.out.println(sum);
        sc.close();
    }
}
