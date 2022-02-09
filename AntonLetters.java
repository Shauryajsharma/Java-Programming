import java.util.*;
public class AntonLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.replace(" ","");
        s = s.replace("{","");
        s = s.replace("}","");
        s = s.replace(",","");
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        if (arr.length == 0)
            System.out.println('0');
        else
        {
            int d = 1;
            for (int i = 1; i < arr.length; i++)
            {
                int j = 0;
                for (j = 0; j < i; j++)
                    if (arr[i] == arr[j])
                        break;
                if (i == j)
                    d++;
            }
            System.out.println(d);
        }
        sc.close();
    }
}
