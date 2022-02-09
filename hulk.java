import java.util.Scanner;
public class hulk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = "";
        for (int i = 1; i <= n; i++)
        {
            if (i%2 != 0)
                str += "I hate ";
            else if (i%2 == 0)
                str += "I love ";
            if (i != n)
                str += "that ";
        }
        str += "it";
        System.out.println(str);
        sc.close();
    }
}
