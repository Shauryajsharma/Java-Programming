import java.util.Scanner;
public class devendragoacc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++)
        {
            int z = sc.nextInt();
            int y = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (z-y-a-b-c >= 0)
            System.out.println("YES");
            else
            System.out.println("NO");
        }
        sc.close();
    }
}
