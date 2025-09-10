import java.util.*;

public class CalculatorusingSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the two numbers : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println("Enter the operation want to perform on the numbers : ");
        char ch = input.next().charAt(0);
        switch(ch){
            case '+' : System.out.println(num1+num2);
                     break;
            case '-' : System.out.println(num1-num2);
                     break;
            case '*' : System.out.println(num1*num2);
                     break;
            case '/' : System.out.println(((float) num1/num2));
                     break;
            case '%' : System.out.println(num1%num2);
                     break;
            default : System.out.println("Invalid input - follow the instructions.");
                     break;     
        }
        input.close();  
    }
}
