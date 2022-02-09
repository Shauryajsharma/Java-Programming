import java.util.*;
public class PerfectAim {
    public static long gcd (long a, long b)
    {
        if (b==0)
            return a;
        else
            return gcd(b, a%b);
    }
    public static long lcm (long a, long b)
    {
        return a*b/gcd(Math.max(a,b), Math.min(a,b));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long x = sc.nextLong();
        long y = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long sum = 0;
        long s1 = n/x;
        long s2 = n/y;
        long s3 = n/lcm(x,y);
        sum = a*s1 + b*s2 + Math.max(a,b)*s3;
        System.out.println(sum);
        sc.close();
    }
}

