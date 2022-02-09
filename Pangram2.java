import java.util.*;
public class Pangram2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        s = s.toLowerCase();
        char[] arr = s.toCharArray();
        int d=1;
        Arrays.sort(arr);
        for (int i = 1; i < n; i++)
        {
            int j = 0;
            for (j = 0; j < i; j++)
                if (arr[i] == arr[j])
                    break;
            if (i == j)
                d++;
        }
        if (d == 26)
            System.out.println("YES");
        else
            System.out.println("NO");
            sc.close();
    }
}
