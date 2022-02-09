import java.util.*;
public class SpyDetected {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0)
        {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
            {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < n-2; i++)
            {
                if (arr[i] != arr[i+1] && arr[i] != arr[i+2])
                {
                    System.out.println(i+1);
                    break;
                }
                else if (arr[i] != arr[i+1] && arr[i] == arr[i+2])
                {
                    System.out.println(i+2);
                    break;
                }
                else if (arr[i] == arr[i+1] && arr[i] != arr[i+2])
                {
                    System.out.println(i+3);
                    break;
                }
            }
        }
        sc.close();   
    }
}
