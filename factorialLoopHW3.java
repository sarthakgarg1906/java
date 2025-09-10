import java.util.*;
public class factorialLoopHW3 {
    public static void main(String[] args) {
        System.out.println("Enter the number whose factorial is to be calculated : ");
        try (Scanner input = new Scanner(System.in)){
        int num = input.nextInt();
        int fact=1;
        int x;
        for(x=num;x>0;x--){
            fact = fact*x;
        }
        System.out.println(fact);
    }
    }
}
