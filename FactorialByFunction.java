import java.util.*;
public class FactorialByFunction {
    public static void factorial(int n){
        int fact=1 ;
        for(int i=n;i>0;i--){
            fact=fact*i;
        }
        System.out.println("Factorial is : " +fact);
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        factorial(n);
        factorial(4);
        Sc.close();
    }
}
