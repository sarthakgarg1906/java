import java.util.*;
public class StarPattern1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbe of lines want to print : ");
        int x = input.nextInt();
        int row , col;
        for(row=1;row<=x;row++){
            for(col=1;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
        input.close();
    }
}