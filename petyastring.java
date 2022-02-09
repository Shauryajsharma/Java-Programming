import java.util.Scanner;
public class petyastring {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        if (str1.equals(str2))
        System.out.print("0");
        else if (str1.compareTo(str2) < 0)
        System.out.print("-1");
        else if (str1.compareTo(str2) > 0)
        System.out.print("1");
        sc.close();
    }
}
