import java.util.*;

public class concatenation {
    public static void main(String[] args) {
        ArrayList<String> a=new ArrayList<String>();
        Scanner in=new Scanner(System.in);
        System.out.println("No. of Strings: ");
        int n=in.nextInt();
        System.out.println();
        for(int i=0;i<n;i++) {
            // String x=;
            a.add(in.next());
        }
        String ans="";
        for(String i:a) {
            ans+=i;
        }
        System.out.println(ans);
        in.close();
    }
}
