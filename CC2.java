import java.util.*;
public class CC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int one=0,two=0;
            for(int i=0;i<n;i++){
                if(sc.nextInt()==1)one++;
                else two++;
            }
            if(one%2==1)System.out.println("NO");
            else if((two%2==1 && one>=2) || two%2==0) System.out.println("YES");
            else System.out.println("NO");
            sc.close();
        }
    }
}
