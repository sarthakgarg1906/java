import java.util.*;
public class Subarrays {    
    public static void subarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k] +" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = Sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=Sc.nextInt();
        }
        subarr(arr);
        Sc.close();
    }
}
