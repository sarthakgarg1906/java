import java.util.*;

public class BinToDec {
    public static void bintodec(int n){
        int mynum = n;
        int pow=0;
        int dec=0;
        while(n>0){
            int lastdig = n%10;
            dec = dec +(int)(lastdig*Math.pow(2,pow));
            pow++;
            n=n/10;
        }
        System.out.println("decimal number of " + mynum + "=" + dec);
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        bintodec(n);
        Sc.close();
    }
}
