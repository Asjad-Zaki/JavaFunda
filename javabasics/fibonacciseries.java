import java.util.*;
public class fibonacciseries{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n1=0,n2=1,n3;
        int num =sc.nextInt();

        System.out.println("Fibonacci series:");

        for(int i=1;i<=num;i++){
            System.out.println(n1+" ");
            n3=n1+n2;
            n1=n2;
            n2=n3;
        }
    }
}