import java.util.*;
public class HollowSquareStarPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of lines : ");
        int x = s.nextInt();
        int row,colm;
        for(row=1;row<=x;row++){
            for (colm = 1; colm <=x; colm++) 
            {
                if (row == 1 || row == x || colm == 1 || colm == x) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); 
        }
    }
}
