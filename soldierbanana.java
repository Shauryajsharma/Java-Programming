import java.util.Scanner;
public class soldierbanana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= w; i++)
        {
            sum += k*i;
        }
        if (n > sum)
        {
            System.out.print("0");
        }
        else
        {
            System.out.print(sum-n);
        }
        sc.close();
    }
    
}
