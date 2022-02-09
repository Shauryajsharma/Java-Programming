import java.util.Scanner;
public class covidtheatretickcc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i < a; i++)
        {
            int r = sc.nextInt();
            int s = sc.nextInt();
            int k;
            if (r%2 == 0)
            {
                k = r/2;
            }
            else
            k = r/2 + 1;
            if (s%2 == 0)
            s = s/2;
            else
            s = s/2 + 1;
            System.out.println(k*s);
        }
        sc.close();
    }
}
