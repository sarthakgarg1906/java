import java.util.*;

public class Reverseofnum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //scanner for input
        try {
            System.out.println("Enter the number: ");
            // Input of the number whose reverse is to find
            int num = input.nextInt();
            int r = 0;
            for (; num > 0; num = num / 10) {
                r = r * 10 + num % 10;
            }
            System.out.println("Answer = " + r);
        } finally {
            input.close(); // Close scanner safely in the finally block
        }
    }
}

