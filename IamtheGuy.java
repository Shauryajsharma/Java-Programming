import java.util.*;
public class IamtheGuy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int[] arr1 = new int[p];
        for (int i = 0; i < p; i++)
        {
            arr1[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        int[] arr2 = new int[q];
        for (int i = 0; i < q; i++)
        {
            arr2[i] = sc.nextInt();
        }
        int[] marr = new int[p+q];
        for (int i = 0; i < p; i++)
        {
            marr[i] = arr1[i];
        }
        for (int i = 0; i < q; i++)
        {
            marr[p+i] = arr2[i];
        }
        int c = 0;
        for (int i = 1; i <= n; i++)
        {
            for (int j = 0; j < p+q; j++)
            {
                if (marr[j] == i)
                {
                    c++;
                    break;
                }
            }
        }
        if (c==n)
        System.out.println("I become the guy.");
        else
        System.out.println("Oh, my keyboard!");
        sc.close();
    }
}
