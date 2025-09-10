import java.util.*;
public class zeroOneTriangle {
    public static void zeroonetraingle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i==j) || (i+j)%2==0){
                    System.out.print(1);
                }
                else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number of lines : ");
        int n = Sc.nextInt();
        zeroonetraingle(n);
        Sc.close();
    }
}
