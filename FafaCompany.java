import java.util.*;
public class FafaCompany {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        for (int l = 1; l < n; l++)
        {
            if ((n-l)%l == 0)
                count++;
        }
        System.out.println(count);
        sc.close();
    }
}
