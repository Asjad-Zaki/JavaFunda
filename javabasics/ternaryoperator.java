import java.util.*;
public class ternaryoperator{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number :");
        int number = sc.nextInt();

        String type =((number%2)==0) ?"Even":"Odd";
        System.out.println(type);
    }
}