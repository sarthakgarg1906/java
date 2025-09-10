import java.util.*;
public class CharacterPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbe of lines want to print : ");
        int x = input.nextInt();
        int row , col;
        char ch = 'A';
        for(row=1;row<=x;row++){
            for(col=1;col<=row;col++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
        input.close();
    }
}
