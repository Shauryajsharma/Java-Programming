import java.util.Scanner;
public class AntonandPolyhedron {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sides = 0;
        for (int i = 0; i < n; i++)
        {
            String str = sc.next();
            if (str.equals("Tetrahedron"))
            sides += 4;
            else if (str.equals("Cube"))
            sides += 6;
            else if (str.equals("Octahedron"))
            sides += 8;
            else if (str.equals("Dodecahedron"))
            sides += 12;
            else if (str.equals("Icosahedron"))
            sides += 20;
        }
        System.out.println(sides);
        sc.close();
    }    
}
