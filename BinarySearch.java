import java.util.Scanner;

public class BinarySearch {
    
    // Binary search function
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left <= right) {
            int mid = (left + right) / 2;  // Calculate the middle index
            
            // Check if the target is at the mid position
            if (arr[mid] == target) {
                return mid;  // Target found, return the index
            }
            
            // If target is greater, ignore the left half
            if (arr[mid] < target) {
                left = mid + 1;
            }
            // If target is smaller, ignore the right half
            else {
                right = mid - 1;
            }
        }
        
        // Target is not present in the array
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Get the size of the array
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        
        // Create the array and input elements
        int[] arr = new int[n];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Get the target value to search for
        System.out.print("Enter the value to search for: ");
        int target = sc.nextInt();
        
        // Perform binary search
        int result = binarySearch(arr, target);
        
        // Display result
        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index " + result);
        }
        
        sc.close();
    }
}

