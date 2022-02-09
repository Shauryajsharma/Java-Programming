import java.util.*;
public class DivisibilityProb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int z;
            if (a%b == 0)
            System.out.println('0');
            else
            {
                z = a%b;
                System.out.println(b-z);
            }
        }
        sc.close();
    }
}
