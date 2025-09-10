import java.util.*;
public class InvertedLeftTriangle {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the number of lines : ");
        int x = S.nextInt();
        int row,col;
        for(row=x;row>=1;row--){
            for(col=1;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



