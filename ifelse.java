import java.util.Scanner;

public class ifelse {
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the age :");
        int age = inp.nextInt();
        if(age>=18)
        {
            System.out.println("Adult...");
        }
        else {
            System.out.println("Not adult...");
        }
        inp.close();
    }
}
