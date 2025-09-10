import java.util.Scanner;
public class arithbinary {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        int sum = a+b;
        int diff = a-b;
        int mul = a*b;
        float div = (float)a/b;
        int mod = a%b;
        System.out.println(sum);
        System.out.println(diff);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(mod);
        inp
        .close();
    }
}
