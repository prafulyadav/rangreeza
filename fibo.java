import java.util.*;
public class Main {
    public static int rec(int n)
    {
        if(n==0 || n==1){
            return n;
        }
        int f1=rec(n-1);
        int f2=rec(n-2);

        return f1+f2;
    }
    public static void main(String args[]) {
            Scanner in=new Scanner(System.in);          
            int n=in.nextInt();
            System.out.println(rec(n));
    }
}
