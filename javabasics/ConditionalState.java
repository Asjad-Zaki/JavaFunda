import java.util.*;
public class ConditionalState{
    public static void main(String args[]) {
        System.out.print("Enter age:");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        
        if(age>=18){
            System.out.println("Eligible to Vote");
        }
        else{
            System.out.println(" Not Eligible to Vote");
        }
    }
}