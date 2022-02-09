import java.util.Scanner;
public class boygirl {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr = str.toCharArray();
        int d = 1;
        for (int i = 1; i < arr.length; i++)
        {
            int j = 0;
            for (j = 0; j < i; j++)
            {
                if (arr[i] == arr[j])
                    break;
            }
                if (i == j)
                    d++;
        }
        if (d%2 == 0)
            System.out.println("CHAT WITH HER!");
        else
            System.out.println("IGNORE HIM!");
        sc.close();
    }    
}
