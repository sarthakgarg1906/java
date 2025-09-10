import java.util.*;
public class assignmentoperator {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers : ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int e = input.nextInt();
        int f ;
        a+=5; // a+5=a
        System.out.println(a);
        b-=20; // b-5=b
        System.out.println(b);
        c*=3; // c*3=c
        System.out.println(c);
        d/=2; // d/2=d
        System.out.println(d);
        e%=2; // e%2=e
        System.out.println(e);
        f=a;
        System.out.println(f);
        input.close();
    }
}
