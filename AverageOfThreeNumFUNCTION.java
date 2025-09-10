import java.util.*;
public class AverageOfThreeNumFUNCTION {
    public static void averageof3num(double n1, double n2, double n3){
        double average = (n1+n2+n3)/3;
        System.out.println("Average of three numbers : " + average);
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter three numbers : ");
        double a = Sc.nextDouble();
        double b = Sc.nextDouble();
        double c = Sc.nextDouble();
        averageof3num(a,b,c);
        Sc.close();
        }
}
