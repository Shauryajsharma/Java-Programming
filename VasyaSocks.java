import java.util.*;
public class VasyaSocks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int b = sc.nextInt();
        if (r >= b)
        {
            r -= b;
            r = r/2;
            System.out.print(b);
            System.out.print(' ');
            System.out.print(r);
        }
        else
        {
            b -= r;
            b = b/2;
            System.out.print(r);
            System.out.print(' ');
            System.out.print(b);
        }
        sc.close();
    }
}
