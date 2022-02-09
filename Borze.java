import java.util.*;
public class Borze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String s = "";
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == '.')
                s += "0";
            else if (str.charAt(i) == '-' && str.charAt(i+1) == '-')
            {
                s += "2";
                i++;
            }
            else if (str.charAt(i) == '-' && str.charAt(i+1) == '.')
            {
                s += "1";
                i++;
            }
        }
        System.out.println(s);
        sc.close();
    }
}
