import java.util.*;
public class AmusingJoke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String fin = sc.next();
        String str = str1+str2;
        int len = str.length();
        char[] arr1 = new char[len];
        char[] arr2 = new char[len];
        if (len != fin.length())
            System.out.println("NO");
        else
        {
            for (int i = 0; i < len; i++)
            {
                arr1[i] = str.charAt(i);
                arr2[i] = fin.charAt(i);
            }
            for (int i = 0; i < len-1; i++)
            {
                for (int j = 0; j < len-i-1; j++)
                {
                    if (arr1[j] > arr1[j+1])
                    {
                        char temp = arr1[j];
                        arr1[j] = arr1[j+1];
                        arr1[j+1] = temp;
                    }
                    if (arr2[j] > arr2[j+1])
                    {
                        char temp = arr2[j];
                        arr2[j] = arr2[j+1];
                        arr2[j+1] = temp;
                    }  
                }
            }
            int count = 0;
            for (int i = 0; i < len; i++)
            {
                if (arr1[i] != arr2[i])
                {
                    count++;
                    break;
                }
            }
            if (count == 0)
            System.out.println("YES");
            else
            System.out.println("NO");
        }
        sc.close();
    }  
}