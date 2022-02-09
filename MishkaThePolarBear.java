import java.util.*;
public class MishkaThePolarBear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int countm = 0, countc = 0;
        while (t-- != 0)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if ( a > b)
            {
                countm++;
            }
            else if ( a == b)
            {
                countm++;
                countc++;
            }
            else
            {
                countc++;
            }
        }
        if (countm > countc)
            {
                System.out.println("Mishka");
            }
            else if (countc > countm)
            {
                System.out.println("Chris");
            }
            else
            {
                System.out.println("Friendship is magic!^^");
            }
        sc.close();
    }
}