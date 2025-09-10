import java.util.*;
public class SUMofnnum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();//input number upto which sum is to be calculated.
        int a = 1;//initilization.
        int sum = 0;
        while(a<=n)//loop will run till a becomes equal to n.
        {
            sum=sum+a;
            a++;//increment i.e a=a+1
        }
        System.out.println(sum);
        input.close();
    }
}
