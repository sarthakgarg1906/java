import java.util.*;

public class TrappingRainwater {
    public static int watertrap(int arr[]) {
        int arr1[] = new int[arr.length]; 
        int arr2[] = new int[arr.length]; 
        int totalwater = 0;
        arr1[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr1[i] = Math.max(arr[i], arr1[i - 1]);
        }
        arr2[arr.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            arr2[i] = Math.max(arr[i], arr2[i + 1]);
        }
        for (int i = 0; i < arr.length; i++) {
            int trappedWater = Math.min(arr1[i], arr2[i]) - arr[i];
            if (trappedWater > 0) {
                totalwater += trappedWater; 
            }
        }

        return totalwater;
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = Sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Sc.nextInt();
        }

        int result = watertrap(arr);
        System.out.println("Total water trapped: " + result);
        Sc.close();
    }
}
