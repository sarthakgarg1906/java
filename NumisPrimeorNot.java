import java.util.*;
public class NumisPrimeorNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int x = input.nextInt();
        int counter = 0;
        for(int i=2;i<=Math.sqrt(x);i++){
            if(x%i==0){
                counter++;
            }
        }
        if(counter>0){
            System.out.println("Number is not prime.");
        } 
        else{
            System.out.println("Number is prime.");
        }
        input.close();
    }
}
