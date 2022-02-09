import java.util.Scanner;
public class andorunicc {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int i = 0; i < t; i++)
            {
                int n = sc.nextInt();
                int[] a = new int[n];
                for (int j = 0; j < n; j++)
                {
                    a[j] = sc.nextInt();
                }
                    
            }
            sc.close();
        }
        catch (Exception e)
        {
            return;
        }
    }
}
