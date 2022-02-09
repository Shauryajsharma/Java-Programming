import java.util.Scanner;
public class easyprob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++)
        {
            int p = sc.nextInt();
            if (p == 1)
            {
                count++;
                break;
            }
        } 
        if (count == 1)
        {
            System.out.println("HARD");
        }
        else
        System.out.println("EASY");
        sc.close();
    }
}
