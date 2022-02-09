import java.util.*;
public class BuyShovel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int r = sc.nextInt();
        for (int i = 1; i <= 9; i++)
        {
            if((k*i)%10 == 0 || (k*i)%10 == r)
            {
                System.out.println(i);
                break;
            }
        }
        sc.close();
    }
}
