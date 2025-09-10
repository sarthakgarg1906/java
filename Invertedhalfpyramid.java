import java.util.*;
public class Invertedhalfpyramid {
    public static void invertedPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number of lines: ");
        int n = Sc.nextInt();
        invertedPyramid(n);
        Sc.close();
    }
}
