import java.util.*;
public class BlackSq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();
        int a4 = sc.nextInt();
        String s = sc.next();
        int c = 0;
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == '1')
                c += a1;
            else if (s.charAt(i) == '2')
                c += a2;
            else if (s.charAt(i) == '3')
                c += a3;
            else
                c += a4;
        }
        System.out.println(c);
        sc.close();
    }
}
