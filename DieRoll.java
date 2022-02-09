import java.util.*;
public class DieRoll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int w = sc.nextInt();
        int diff;
        if (y>w)
            diff = 6-y+1;
        else
            diff = 6-w+1;
        if (diff == 0)
            System.out.println("0/1");
        else if (diff == 1)
            System.out.println("1/6");
        else if (diff == 2)
            System.out.println("1/3");
        else if (diff == 3)
            System.out.println("1/2");
        else if (diff == 4)
            System.out.println("2/3");
        else if (diff == 5)
            System.out.println("5/6");
        else
            System.out.println("1/1");
        sc.close();
    }
}
