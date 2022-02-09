import java.util.Scanner;
public class Magnets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100000000];
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int count = 1;
        for (int i = 0; i < n-1; i++)
        {
            if (arr[i] != arr[i+1])
            count++;
        }
        System.out.println(count);
        sc.close();
    }
}
