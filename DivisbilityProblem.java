import java.util.Scanner;
public class DivisbilityProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            for (int j = a; j < a+b; j++)
            {
                if (a%b == 0)
                {
                    System.out.println(count);
                    break;
                }
                else
                count++;
            }
        }
        sc.close();
    }
}
