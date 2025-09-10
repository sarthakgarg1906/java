import java.util.*;
public class PyramidStarPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of lines : ");
        int x = input.nextInt();
        int row,colm,space;
        for(row=1;row<=x;row++){
            for(space=x-row;space>0;space--){
                System.out.print(" ");
            }
            for(colm=1;colm<=row*2-1;colm++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
