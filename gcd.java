import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        int d=in.nextInt();
        int ds=in.nextInt();
        while(d%ds!=0)
        {
            int rem = d%ds;
            d=ds;
            ds=rem;
        }
        System.out.println(ds);
    }
}
