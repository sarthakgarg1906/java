import java.util.*;
public class FunctionProductofTwoNum {
    public static int Product(int a, int b){
        int product = a*b;
        return product;
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        int product = Product(a, b);
        System.out.println("Product of num is : " + product);
        Sc.close();
    }
}
