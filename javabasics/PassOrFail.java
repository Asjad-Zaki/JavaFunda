import java.util.*;
public class PassOrFail {
    public static void main (String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Mark of the student:");
        
        int mark = sc.nextInt();

      /*String type =(mark>=35) ?"Pass" : "Fail";// Using Ternary operator method
       System.out.println(type); */

       //conditional method
       if(mark>=35){
        System.out.println("Pass");
       }
       else{
        System.out.println("Fail");
       }

    }
}