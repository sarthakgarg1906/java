import java.util.*;
public class DecimalToBinary  {
    public static void dectobin(int n){
        int mynum = n;
        int pow=0;
        int bin=0;
        while(n>0){
            int rem = n%2;
            bin = bin + rem*(int)Math.pow(10,pow);
            pow++;
            n=n/2;
        }
        System.out.println("binary number of " + mynum + " is " + bin);
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        dectobin(n);
        Sc.close();
    }
}
