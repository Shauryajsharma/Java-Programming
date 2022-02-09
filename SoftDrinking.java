import java.util.*;
public class SoftDrinking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        int nl = sc.nextInt();
        int np = sc.nextInt();
        int[] arr = new int[3];
        arr[0] = k*l/nl;
        arr[1] = c*d;
        arr[2] = p/np;
        Arrays.sort(arr);
        System.out.println(arr[0]/n);
        sc.close();
    }
}
