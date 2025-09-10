import java.util.*;
public class whileloop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("how many time you want to print Hello World ? : ");
        int a = input.nextInt();
        int n = 0;
        while(n<a){
            System.out.println("Hello World.");
            n++;
        }
        input.close();
    }
}
