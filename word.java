import java.util.Scanner;
public class word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count1 = 0, count2 = 0;
        int len = str.length();
        for (int i = 0; i < len; i++)
        {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch))
            {
                count1++;
            }
            else{
                count2++;
            }
        }
        if (count1 > count2)
        {
            System.out.println(str.toUpperCase());
        }
        else
        {
            System.out.println(str.toLowerCase());
        }
        sc.close();
    }
    
}
