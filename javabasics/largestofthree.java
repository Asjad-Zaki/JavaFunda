import java.util.*;
public class AreaofSquare{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number :");
        int a = sc.nextInt();
        System.out.print("Enter Second Number :");
        int b = sc.nextInt();
        System.out.print("Enter Third Number :");
        int c = sc.nextInt();

        if(a>b && a>c){
            System.out.println(a +" is the largest number");
        }
        else if(b>c){
            System.out.println(b +"is the largest number");
        }
        else{
            System.out.println(c + "is the largest number");
        }
    }
}