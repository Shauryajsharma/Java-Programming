import java.util.*;
public class DislikeThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0)
        {
            int k = sc.nextInt();
            int[] arr = new int[1000];
            int i = 0, p =1;
            while (i < 1000)
            {
                if ((p%3 != 0 || p%10 != 3) && (p%3 != 0 && p%10 != 3))
                {
                    arr[i] = p;
                    i++;
                }
                p++;
            }
            System.out.println(arr[k-1]);
        }
        sc.close();
    }
}
