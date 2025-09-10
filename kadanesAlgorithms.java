import java.util.*;
public class kadanesAlgorithms {
    public static void kadanes(int arr[]){
        int cs=0;
        int ms=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            cs=cs+arr[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(ms, cs);
        }
        System.out.println(ms);
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
        kadanes(arr);
        Sc.close();
    }
}
