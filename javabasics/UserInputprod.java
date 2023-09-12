import java.util.*;
public class UserInputprod {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number :");
        int a = sc.nextInt();
        System.out.print("Enter Second Number :");
        int b = sc.nextInt();
        int prod = a * b;
        System.out.println("Product of a & b is "+prod);
    }
}