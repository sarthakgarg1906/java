import java.util.*;
public class HollowRectangle {
    public static void hollowrectangle(int rows , int colm){
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=colm;j++){
                if(i==1||i==rows||j==1||j==colm)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows = Sc.nextInt();
        System.out.println("Enter the number of columns : ");
        int colm = Sc.nextInt();
        hollowrectangle(rows,colm);
        Sc.close();
    }
}
