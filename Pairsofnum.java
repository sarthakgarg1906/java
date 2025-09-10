import java.util.*;
public class Pairsofnum {
    public static void pairs(int arr[]){
        for(int i=0;i<arr.length;i++){
            int x = arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+ x+"," + arr[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = Sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter the elements of array : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=Sc.nextInt();
        }
        pairs(arr);
         Sc.close();
    }
}
