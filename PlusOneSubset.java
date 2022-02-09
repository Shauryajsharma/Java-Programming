import java.util.Scanner;
import java.util.Arrays;
public class PlusOneSubset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int  i = 0; i < t; i++)
        {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++)
            {
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);
            int max = arr[(arr.length)-1];
            int min = arr[0];
            System.out.println(max-min);
        }
        sc.close();
    }
}
