import java.util.*;
public class EvenorNotFUNCTION {
    public static boolean isEven(int n){
        boolean b;
        if(n%2==0){
            b=true;
        }
        else{
            b=false;
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number to check : ");
        int n = Sc.nextInt();
        if(isEven(n)==true){
            System.out.println("Number is even.");
        }
        else{
            System.out.println("Number is odd.");
        }
        Sc.close();
    }
}
