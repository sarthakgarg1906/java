import java.util.*;
public class logicaloperator{
    public static void main(String args[])
    {
    Scanner inp = new Scanner(System.in);
    System.out.println("Enter the numbers : ");
    int a = inp.nextInt();
    int b = inp.nextInt();
    int c = inp.nextInt();
    int d = inp.nextInt();
    System.out.println((a>b)&&(c>d));
    System.out.println((a>b)||(c>d));
    System.out.println(!(c>d));
    inp.close();
    }
    }
