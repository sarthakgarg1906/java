import java.util.*;
public class SolidRhombus {
    public static void Rhombus(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int k=1;k<=n;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number of lines : ");
        int n = Sc.nextInt();
        Rhombus(n);
        Sc.close();
    }
}
