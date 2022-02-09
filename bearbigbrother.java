import java.util.Scanner;
public class bearbigbrother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        while (l <= b)
        {
            count++;
            l += 2*l;
            b += b;
            if (l>b)
                break;
        }
        System.out.println(count);
        sc.close();
    }    
}
