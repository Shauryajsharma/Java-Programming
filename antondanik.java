import java.util.Scanner;
public class antondanik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int count1=0,count2=0;
        for (int i = 0; i < n; i++)
        {
            if (str.charAt(i) == 'A'){
                count1++;
            }
            else{
                count2++;
            }
        }
        if (count1 > count2)
            System.out.print("Anton");
        else if (count1 < count2)
            System.out.print("Danik");
        else
            System.out.print("Friendship");
        sc.close();
    }
}
