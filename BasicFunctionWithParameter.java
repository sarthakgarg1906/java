import java.util.*;
public class BasicFunctionWithParameter {
    int calculateSum(int a, int b){
        int sum = a+b;
        System.out.println("Sum is : " + sum);
        return 0;
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        BasicFunctionWithParameter obj = new BasicFunctionWithParameter();
        obj.calculateSum(a, b);
        Sc.close();
    }
}