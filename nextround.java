import java.util.Scanner;
public class nextround {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int n,k;
        n = input.nextInt();
        k = input.nextInt();
        int[] arr = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++)
        {
            arr[i] = input.nextInt();
            if (arr[i] >= arr[k-1] && arr[i] > 0)
            count++;
        }
        System.out.print(count);
        input.close();
    }    
}
