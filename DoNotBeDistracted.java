import java.util.*;
public class DoNotBeDistracted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0)
        {
            int count = 0;
            int len = sc.nextInt();
            String s = sc.next();
            char[] arr = s.toCharArray();
            int b = 0;
            for (int i = 0; i < len-1; i++)
            {
                if (arr[i] != arr[i+1])
                {
                    for (int j = i+1; j < len; j++)
                    {
                        if (arr[j] == arr[i])
                            count++;
                    }
                    if (count > 0)
                    {
                        System.out.println("NO");
                        b = 1;
                        break;
                    }
                } 
            }
            if (b == 0)
                System.out.println("YES");
        }
        sc.close();
    }
}
