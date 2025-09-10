import java.util.*;
public class CONDITIONALhomework2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ypur body temp. in fahrenheit : ");
        float temp = input.nextFloat();
        if(temp>100){
            System.out.println("You have a fever.");
        }
        else{
            System.out.println("You don`t have a fever.");
        }
        input.close();
    }
}
