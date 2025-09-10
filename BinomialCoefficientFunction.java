import java.util.*;
public class BinomialCoefficientFunction{
    public static int factorial(int n){
        int fact=1 ;
        for(int i=n;i>0;i--){
            fact=fact*i;
        }
        return fact;
    }
    public static int b(int n, int r){
        int a = factorial(n);
        int b = factorial(r);
        int c = factorial(n-r);
        int bf = a/(b*c);
        return bf;
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int r = Sc.nextInt();
        System.out.println("Binomial coefficient : " + b(n, r) );
        Sc.close();
    }
}
