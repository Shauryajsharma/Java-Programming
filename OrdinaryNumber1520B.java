import java.util.*;
public class OrdinaryNumber1520B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0)
        {
            int n = sc.nextInt();
            if (n < 10)
            {
                System.out.println(n);
                continue;
            }
            else
            {
                int count = 9;
                for (int i = 10; i <= n; i++)
                {
                    int num = i;
                    boolean visited[] = new boolean[10];
                    while (num != 0)
                    {
                        if (visited[num % 10])
                            break;
                        visited[num%10] = true;
                        num = num/10;
                    }
                    if (num != 0)
                        count++;
                }
                System.out.println(count);
            }
        }
        sc.close();
    }
}
