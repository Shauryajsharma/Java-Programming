import java.util.Scanner;
import java.util.Arrays;
public class DivbyTwoPermut {
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
            for (int j = 0; j < n; j++)
            {
                if (arr[j] < n)
                    continue;
                else
                {
                    if(j!=0)
                    {
                        while (arr[j] > n && arr[j] > arr[j-1])
                        {
                            arr[j] = arr[j]/2;
                        }
                        continue;
                    }
                    else
                    {
                        while (arr[0] != 1)
                        {
                            arr[0] = arr[0]/2;
                        }
                    }
                }
            }
            Arrays.sort(arr);
            int[] newarr = new int[n];
            for (int k = 0; k < n; k++)
            {
                newarr[k] = k+1;
            }
            int count = 0;
            for (int j = 0; j < n; j++)
            {
                if (arr[j] != newarr[j])
                {
                    count++;
                    break;
                }
            }
            if (count > 0)
                System.out.println("NO");
            else
                System.out.println("YES");
            sc.close();
        }
    }
}