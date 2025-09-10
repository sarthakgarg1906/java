import java.util.*;
public class relationaloperator {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers : ");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println((a==b));
        System.out.println((a!=b));
        System.out.println((a>b));
        System.out.println((a<b));
        System.out.println((a>=b));
        System.out.println((a<=b));
        input.close();
    }
}
