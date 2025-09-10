import java.util.*;
public class FloydsTriangleFunction {
    public static void floydtriangle(int n){
        int counter = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("\t" + counter);
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number of lines want to print : ");
        int n = Sc.nextInt();
        floydtriangle(n);
        Sc.close();
    }
}
