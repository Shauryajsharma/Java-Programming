import java.util.Scanner;
public class georgeaccomdn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p,q,count=0;
        for (int i = 0; i < n; i++)
        {
            p = sc.nextInt();
            q = sc.nextInt();
            if (p+2 <= q)
            {
                count++;
            }
        }
        System.out.print(count);
        sc.close();
    }
}
