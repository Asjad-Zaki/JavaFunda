import java.util.*;
public class positiveOrnegative {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number :");
        int num = sc.nextInt();

        if(num>=0){
           System.out.print(num+" is Positive Number");  
        }
        else{
            System.out.print(num+" is Negative Number");
        }
    }
}