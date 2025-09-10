import java.util.*;
public class MathFunction {
    public static void minoutof2(int a , int b){
        int min = Math.min(a,b);
        System.out.println("Minimum number out of two is " + min);
    }
    public static void maxoutof2(int a , int b){
        int max = Math.max(a,b);
        System.out.println("Maximum number out of two is " + max);
    }
    public static void squareroot(int a){
        double root = Math.sqrt(a);
        System.out.println("Square root of number is " + root);
    }
    public static void power(int a , int b){
        double power = Math.pow(a,b);
        System.out.println("here num1 raise to the power num2 is " + power);
    }
    public static void absolute(int a ){
        int min = Math.abs(a);
        System.out.println("Absolute value of number is " + min);
    }
    public static void main(String[] args) {
       Scanner Sc = new Scanner(System.in);
       System.out.println("Enter two numbers out of which minimum number is to find : "); 
       int a = Sc.nextInt();
       int b = Sc.nextInt();
       System.out.println("Enter two numbers out of which miximum number is to find : "); 
       int c = Sc.nextInt();
       int d = Sc.nextInt();
       System.out.println("Enter the number whose square root is to be calculated : "); 
       int e = Sc.nextInt();
       System.out.println("Enter two numbers such that num1 raise to the power num2 : "); 
       int f = Sc.nextInt();
       int g = Sc.nextInt();
       System.out.println("Enter the - ve number whose absolute value is to find : "); 
       int h = Sc.nextInt();
       minoutof2(a,b);
       maxoutof2(c,d);
       squareroot(e);
       power(f,g);
       absolute(h);
       Sc.close();
    }
}
