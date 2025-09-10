import java.util.Scanner;
public class MaxSumSubarrayII {
    public static void highestSumsubarray(int arr[]){
        int currsum=0;
        int maxsum = Integer.MIN_VALUE;
        int prefixarr[] = new int[arr.length];
        prefixarr[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixarr[i] = prefixarr[i - 1] + arr[i];
        }
        for(int i=0;i<arr.length;i++){
            currsum=0;
            int start =i;
            for(int j=i;j<arr.length;j++)
            {
                int end = j;
                currsum = (start == 0) ? prefixarr[end] : prefixarr[end] - prefixarr[start - 1];
            }
            if(maxsum<currsum){
                maxsum=currsum;
            }
        }
        System.out.println("Maximum sum : "+maxsum);
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
        highestSumsubarray(arr);
        Sc.close();
    }
}
