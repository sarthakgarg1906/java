import java.util.*;
public class CONDITIONALhomework1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.err.println("Enter the number to check whether it is +ve or -ve : ");
        int number = input.nextInt();
        if(number>=0){
            System.err.println("Positive or equal to 0.");
        }
        else{
            System.err.println("Negative.");
        }
        input.close();
    }
}

