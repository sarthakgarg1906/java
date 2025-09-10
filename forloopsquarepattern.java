import java.util.*;
public class forloopsquarepattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of lines want to print :  ");
        int n = input.nextInt();//input for num of lines in square pattern.
         // Loop through the rows
        for(int line = 1; line<=n;line++ ){
            // Loop through the columns
            for(int col = 1; col<=n;col++ ){
                System.out.print("*");
            }
            System.out.println();//for next line
        }
        input.close();
    }
}
