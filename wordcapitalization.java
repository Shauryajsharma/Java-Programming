import java.util.Scanner;
public class wordcapitalization {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String letter = str.substring(0,1);
        String rem = str.substring(1);
        letter = letter.toUpperCase();
        String newstr = letter + rem;
        System.out.println(newstr);

        sc.close();
    }
}
