import java.util.*;
public class AreaofSquare{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        float side = sc.nextFloat();
        float area = side * side;
        System.out.println("Area of Square is :"+area);
    }
}