import java.util.*;

public class sum2numuserinp {
    public static void main(String args[]){
       Scanner input = new Scanner(System.in);
       int a = input.nextInt();
       int b = input.nextInt();
       int sum = a+b;
       int mul = a*b;
       System.out.println(sum);
       System.out.println(mul);
       input.close();
    }
}
