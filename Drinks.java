import java.util.Scanner;
public class Drinks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        double sum = 0;
        for (int i = 0; i < n; i++)
        {
            double p =sc.nextInt();
            sum += (p/100);
        }
        double vol = (sum/n)*100;
        System.out.println(vol);
        sc.close();
    }
}
