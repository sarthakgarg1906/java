import java.util.*;
public class PalindromeFunction {
    public static void palindrome(int n){
        int original = n;
        int rev=0;
        while(n>0){
            rev = rev*10+n%10;
            n=n/10;
        }
        if(rev==original){
            System.out.println("Number is palindrome.");
        }
        else{
            System.out.println("NUmber is not palindrome.");
        }
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number to check : ");
        int n = Sc.nextInt();
        palindrome(n);
        Sc.close();
    }
}
