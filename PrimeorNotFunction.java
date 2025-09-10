import java.util.*;

public class PrimeorNotFunction{
    public static boolean prime(int n ){
        boolean p = true;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0){
               p = false;
               break;
            }
        }
            return p;
        }
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        System.out.println(prime(n));
        Sc.close();
    }  
    }

