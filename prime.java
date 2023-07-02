import java.util.*;
public class Main {
    public static boolean isprime(int n){
        if(n<=1){
            return false;
        }
        
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        if(isprime(n))
         System.out.println("Prime");
         else
         System.out.println("Not Prime");
    }
}
