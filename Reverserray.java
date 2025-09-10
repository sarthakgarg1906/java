import java.util.*;
public class Reverserray {
    // Reverse function
    public static void reverse(int rev[]){
        int first=0;
        int last = rev.length-1;
        int swap=0;
        while(first<last){
            swap = rev[first];
            rev[first]=rev[last];
            rev[last]=swap;
            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       // Get the size of the array
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        
        // Create the array and input elements
        int[] rev = new int[n];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            rev[i] = sc.nextInt();
        }
        reverse(rev);
        System.out.println("The reverse of array is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(rev[i] + "  ");
        }
        sc.close();
}
}