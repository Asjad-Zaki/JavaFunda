import java.util.*;
public class averageofthree {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number :");
        int a = sc.nextInt();
        System.out.print("Enter Second Number :");
        int b = sc.nextInt();
        System.out.print("Enter Third Number :");
        int c = sc.nextInt();
        float average = (a + b + c)/2;
        System.out.println("Average Of three Number is "+average);
    }
}