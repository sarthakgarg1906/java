import java.util.*;
public class LinearSearchArray {
    public static int Search(int ls[],int x){
        int i;
        for(i=0;i<ls.length;i++){
            if(x==ls[i]){
            return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = Sc.nextInt();
        int ls[] = new int[n];
        System.out.println("Enter the numbers in array : ");
        for(int i=0;i<ls.length;i++){
            ls[i] = Sc.nextInt();
        }
        System.out.println("Enter the number to search in array");
        int x = Sc.nextInt();
        int index = Search(ls,x);
        if(index==-1){
            System.out.println("Number not found.");
        }
        else 
        System.out.println("Number found at index : "+index);
        Sc.close();
    }
}
