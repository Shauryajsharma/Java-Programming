import java.util.Scanner;
public class longword {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++)
        {
            String str = sc.nextLine();
            int len1 = str.length()-1;
            int len2 = str.length()-2;
            if (str.length() > 10)
            {
                System.out.print(str.charAt(0));
                System.out.print(len2);
                System.out.println(str.charAt(len1));
            }
            else
            {
                System.out.println(str);
            }
        }
        sc.close();
    }     
}
