import java.util.*;
public class studentpassorfail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the marks : ");
        int marks = input.nextInt();
        String result = ((marks>=33)?"Pass.":"Fail.");
        System.err.println("Student is : " + result);
        input.close();
    }
}
 