import java.util.*;
public class largestNumArray {
    public static void maxnum(int largest[]){
        int max,i;
        max = largest[0];
        for(i=1;i<largest.length;i++){
            if(max<largest[i]){
                max = largest[i];
            }
        }
        System.out.println("The largest number in array is "+ max);
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = Sc.nextInt();
        int largest[] = new int[n];
        System.out.println("Enter the numbers in array : ");
        for(int i=0;i<n;i++){
            largest[i] = Sc.nextInt();
        }
        maxnum(largest);
        Sc.close();
    }
}
