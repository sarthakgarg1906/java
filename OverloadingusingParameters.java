import java.util.*;
public class OverloadingusingParameters {
    public static int sum(int a, int b){
        int sum=a+b;
        return sum;
    }
    public static int sum(int a, int b,int c){
        int sum=a+b+c;
        return sum;
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int num1 = Sc.nextInt();
        int num2 = Sc.nextInt();
        System.out.println("Enter 1 if want to enter one more number otherwise 0 : ");
        int num = Sc.nextInt();
        if(num==1){
            int num3 = Sc.nextInt();
            System.out.println("Sum = " +sum(num1, num2, num3));
        }
        else{
            System.out.println("Sum = " + sum(num1,num2));
        }
        Sc.close();
    }
}
