import java.util.*;
public class incometaxcalculator {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the salary package  : ");
        float pack = input.nextFloat();
        if(pack < 500000){
            System.out.println(" tax : " + (pack*0.0));
        }
        else if(pack>=500000 && pack<1000000){
            System.out.println(" tax : " + (pack*0.2));
        }
        else{
            System.out.println(" tax : " + (pack*0.3));
        }
        input.close();
    }
}
