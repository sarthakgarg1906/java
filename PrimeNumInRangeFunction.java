import java.util.*;
public class PrimeNumInRangeFunction {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the initial number of range : ");
        int a = S.nextInt();
        System.out.println("Enter the final number of range : ");
        int b = S.nextInt();
        for(int i=a;i<=b;i++){
            if(prime(i)==true){
                System.out.println(i);
            }
        }
        S.close();
    }
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
}
