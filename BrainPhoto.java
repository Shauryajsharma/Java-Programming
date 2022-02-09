import java.util.*;
public class BrainPhoto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[] arr = new char[m*n];
        int c = 0;
        for (int i = 0; i < m*n; i++)
        {
            arr[i] = sc.next().charAt(0);
        }
        for (int i = 0; i < m*n; i++)
        {
            if (arr[i] == 'C' || arr[i] == 'M' || arr[i] == 'Y')
            {
                c++;
                break;
            }
        }
        if (c == 0)
            System.out.println("#Black&White");
        else
            System.out.println("#Color");
        sc.close();
    }
}
