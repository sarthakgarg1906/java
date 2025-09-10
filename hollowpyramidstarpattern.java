import java.util.*;
public class hollowpyramidstarpattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of lines : ");
        int x = s.nextInt();
        int row,space;
        for(row=1;row<=x;row++){
            for(space=x-row;space>0;space--){
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * row - 1); j++) {
                if (j == 1 || j == (2 * row - 1) || row == x) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
    }
    }
}
