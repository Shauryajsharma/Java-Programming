import java.util.Scanner;
public class nearlucky {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m;
        int count = 0, count1 = 0;
        m = n;
        while (m != 0){
            m = m/10;
            count++;
        }
        for (int i = 0; i < count; i++)
        {
            if (n%10 == 4 || n%10 == 7)
            {
                count1++;
            }
            n = n/10;
        }
        if (count1 == 4 || count1 == 7)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
        sc.close();
    }
}
