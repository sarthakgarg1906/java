import java.util.*;

public class largestoftwonum {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the two numbers : ");
        int a = input.nextInt();
        int b = input.nextInt();
        if(a>b)
            System.out.println("Greatest number is : " + a);
        else
            System.out.println("Greatest number is : " + b);
            input.close();
            
}
}
