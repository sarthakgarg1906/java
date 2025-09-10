import java.util.*;
public class printnumloops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int a = 1;
        while(a<=num){
            System.out.print("\t" + a);
            a++;
        }
        input.close();
    }
}
