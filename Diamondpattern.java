import java.util.*;
public class Diamondpattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of lines: ");
        int x = s.nextInt();

        // For upper half of the diamond (including the middle row)
        for (int row = 1; row <= x / 2 + 1; row++) {
            // Print leading spaces
            for (int space = 1; space <= x / 2 + 1 - row; space++) {
                System.out.print(" ");
            }
            // Print stars
            for (int colm = 1; colm <= 2 * row - 1; colm++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // For the lower half of the diamond
        for (int row = x / 2; row >= 1; row--) {
            // Print leading spaces
            for (int space = 1; space <= x / 2 + 1 - row; space++) {
                System.out.print(" ");
            }
            // Print stars
            for (int colm = 1; colm <= 2 * row - 1; colm++) {
                System.out.print("*");
            }
            System.out.println();
        }

        s.close(); // Close scanner
    }
}
