import java.util.*;
public class OverloadingusingDataType {
    public static int sum(int a,int b){
        int sum = a+b;
        return sum;
    }
    public static float sum(float c,float d){
        float sum = c+d;
        return sum;
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the two integers : ");
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        System.out.println("Enter the two float values : ");
        float c = Sc.nextFloat();
        float d = Sc.nextFloat();
        System.out.println("Sum = " +sum(a,b));
        System.out.println("Sum = " +sum(c,d));
        Sc.close();
    }
}
