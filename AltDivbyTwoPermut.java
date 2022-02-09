import java.util.*;
import java.util.Arrays;
public class AltDivbyTwoPermut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++)
        {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++)
            {
                arr[j] = sc.nextInt();
            }
            int[] narr = new int[100*n];
            for (int j = 0; j < n; j++)
            {
                int count = 0;
                while (arr[j] > 1)
                {
                    arr[j] = arr[j] / 2;
                    if (arr[j] < n)
                    {
                        narr[count] = arr[j];
                        count++;
                    }
                }
            }
            int index = 0;
            int[] distarr = new int[n];
            for (int j = 0; j < narr.length; j++)
            {
                int flag = 0;
                for (int k = 0; k < j; k++)
                {
                    if (narr[j] == narr[k])
                    {
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0)
                {
                    distarr[index] = narr[j];
                    index++;
                }
            }
            Arrays.sort(distarr);
            int[] newarr = new int[n];
            for (int k = 0; k < n; k++)
            {
                newarr[k] = k+1;
            }
            int cp = 0;
            for (int k = 0; k < n; k++)
            {
                if (distarr[k] != newarr[k])
                {
                    cp++;
                    break;
                }
            }
            if (cp > 0)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
        sc.close();
    }
}
