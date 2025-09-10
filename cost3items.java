import java.util.*;
public class cost3items {
    public static void main(String[] args) {
        Scanner cost = new Scanner(System.in);
        System.out.println("Enter the cost of pencil :");
        float pencil = cost.nextFloat();
        System.out.println("Enter the cost of pen :");
        float pen = cost.nextFloat();
        System.out.println("Enter the cost of Eraser :");
        float eraser = cost.nextFloat();
        double sum = pencil+pen+eraser;
        double total = sum + 0.18*sum;
        System.out.println("The total bill after 18% GST is :");
        System.out.println(total);
        cost
        .close();
    }
}
