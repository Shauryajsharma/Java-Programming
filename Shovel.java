import java.util.Scanner;
public class Shovel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int r = sc.nextInt();
        for (int i = 1; i <= k; i++)
        {
            int a = k*i;
            int b = a-r;
            if (b%10 == 0 || a%10 == 0)
            {
                System.out.println(i);
                break;
            }
            else if (b%10 == 0)
            {
                System.out.println(i);
                break;
            }
        }
        sc.close();
    }
}
