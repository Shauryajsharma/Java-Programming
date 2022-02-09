import java.util.Scanner;
public class vanyafence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,h;
        n = sc.nextInt();
        h = sc.nextInt();
        int nh = 0;
        for (int i = 0; i < n; i++)
        {
            int a = sc.nextInt();
            if (a > h)
            {
                nh += 2;
            }
            else
            {
                nh += 1;
            }
        }
        System.out.print(nh);
        sc.close();
    }
}
