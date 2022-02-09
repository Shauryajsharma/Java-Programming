import java.util.*;
public class horseshoe {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();
        int d =sc.nextInt();
        if (a==b && b==c && c==d)
        System.out.println('3');
        else if ((a==b && b==c) || (a==b && b==d) || (a==c && c==d) || (b==c && c==d))
        System.out.println('2');
        else if ((a==b && d==c) || (a==c && b==d) || (a==d && c==b))
        System.out.println('2');
        else if (a==b || a==c || a==d || b==c || b==d || c==d)
        System.out.println('1');
        else
        System.out.println('0');
        sc.close();
    }
}
