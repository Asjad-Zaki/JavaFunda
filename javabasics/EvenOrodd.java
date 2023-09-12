import java.util.*;
//Even or odd 
public class EvenOrodd {
    public static void main(String args[]) {
        System.out.print("Enter Number:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if((number%2)==0){
           System.out.print(number +" is an Even Number"); 
        }
        else{
            System.out.print(number +" is an Odd Number:");
        }
    }
}
