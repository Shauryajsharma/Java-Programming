import java.util.*;
public class AddOddSubtractEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--!=0)
        {
            int a = sc.nextInt(), b =sc.nextInt(), diff = 0, count = 1;
            if (a==b)
                count=0;
            else if (a>b)
            {
                diff = a-b;
                if (diff%2 == 0)
                    count=1;
                else
                    count++;
            }
            else if (b>a)
            {
                diff = b-a;
                if (diff%2 == 0)
                    count++;
                else
                    count=1;
            }
            System.out.println(count);
        }
        sc.close();
    }
}
