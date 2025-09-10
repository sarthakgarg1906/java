import java.util.*;

public class ReversePyramidStarPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of lines : ");
        int x = input.nextInt();
        int row,colm,space;
        for(row=x;row>=1;row--){
            for (space = 0; space < x - row; space++) {
                System.out.print(" ");
            }
            for(colm=0;colm<row*2-1;colm++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

