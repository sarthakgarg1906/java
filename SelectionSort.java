import java.util.*;
public class SelectionSort {
    public static void selectionsort(int arr[]){
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex=j;
                }
            }
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
        }
    }

    public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print("\t"+arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = Sc.nextInt();
        int arr[]= new int[n];
        System.out.println("enter the elements of array : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=Sc.nextInt();
        }
        selectionsort(arr);
        printarray(arr);
        Sc.close();
    }
}
