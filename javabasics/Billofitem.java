import java.util.*;

//BIllof 3 item;
public class Billofitem {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat(); 

        float total = pencil + pen + eraser;

        System.out.println("Bill is :"+total);

        //with 18% GST

        float newTotal = total + (0.18f * total);

        System.out.println("Bill with 18% GST is :"+newTotal);                                                                   
    }
}