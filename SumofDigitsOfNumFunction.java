import java.util.*;
public class SumofDigitsOfNumFunction {
    public static void Sum(int n){
        int sum = 0;
        while(n>0){
            sum = sum + n%10;
            n=n/10;
        }
        System.out.println("Sum of digits of given number = " + sum);
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = Sc.nextInt();
        Sum(n);
        Sc.close();
    }
}
