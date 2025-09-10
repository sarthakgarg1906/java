import java.util.*;
public class CONDITIONALhomework5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year : ");
        int year = input.nextInt();
        if(year%4==0 && (year%100!=0 || year%400==0)){
            System.out.println("Leap year.");
        }
        else{
            System.out.println("Not leap year.");
        }
        input.close();
    }
}
