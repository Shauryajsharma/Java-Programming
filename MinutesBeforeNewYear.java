import java.util.*;
public class MinutesBeforeNewYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--!=0)
        {
            int hr = sc.nextInt();
            hr = (23-hr)*60;
            int min = sc.nextInt();
            min = 60-min;
            System.out.println(hr+min);
        }
        sc.close();
    }
}
