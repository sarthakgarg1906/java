import java.util.*;
public class StarPattern2 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the number of lines : ");
        int x = S.nextInt();
        for(int i=x;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        S.close();
    }
}
