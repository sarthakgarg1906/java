import java.util.*;
public class largestofthreenum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        if(num1>num2 && num1>num3){
            System.out.println("Largest number is : " + num1);
        }
       else if(num2>num3){
            System.out.println("Largest number is : " + num2);
        }
        else if(num1==num2 && num1==num3){
            System.out.println("All are equal.");
        }
        else {
            System.out.println("Largest number is : " + num3);
        }
        input.close();
    }
}
