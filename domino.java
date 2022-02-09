import java.util.Scanner;
public class domino {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int prod;
        prod = (m*n);
        System.out.println(prod/2);
        sc.close();
    }
}
