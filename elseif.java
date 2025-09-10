import java.util.*;
public class elseif {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the age :");
        int age = input.nextInt();
        if(age>=18)
        System.out.println("Adult.");
        else if(age>=13 && age<18)
        System.out.println("teenager.");
        else 
        System.out.println("Child.");
        input.close();
    }
}
