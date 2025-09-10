import java.util.*;
public class areaofcircle{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        float rad = input.nextFloat();
        float area = (3.14f*rad*rad);
        System.out.println(area);
        input.close();
    }
}
