import java.util.*;

public class ContinueStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            int x = input.nextInt();
            if (x % 5 == 0) {
                continue; // Skip the rest of the loop when x is divisible by 5
            }
            if(x<1000){
                System.out.println(x);
            break;
            }
        }
        input.close(); // Close the scanner outside of the loop
    }
}

