import java.util.*;
public class ParkLighting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int p = a*b;
            if (p%2 == 0)
                p = p/2;
            else
                p = (p/2)+1;
            System.out.println(p);
        }
        sc.close();
    }   
}
