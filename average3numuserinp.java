import java.util.*;
public class average3numuserinp{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int sum = a+b+c;
        double avg = sum/3.0;
        System.out.println(avg);
        input.close();
    }
}