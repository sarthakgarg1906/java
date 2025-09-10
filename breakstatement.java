import java.util.*;
public class breakstatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            int x = input.nextInt();
            if(x%10==0){
                break;
            }
            System.out.println(x);
        }
        System.out.println("It is the multiple of 10.");
        input.close();
    }
}
