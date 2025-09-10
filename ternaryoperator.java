import java.util.*;
public class ternaryoperator{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int largest = ((num1>num2 && num1>num3)? num1 : (num2>num3)?num2 : num3);
        System.out.println("Largest number is : " + largest);
        input.close();
    }
}

