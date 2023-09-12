import java.util.Scanner;
public class nestedif {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int mark = sc.nextInt();
        if(mark>=35){
            System.out.println("Pass");
            if(mark>=80){
                System.out.println("leader");
            }
            else{
                System.out.println("not a first grade");
            }
        
        }
        else{
            System.out.println("Failed!");
        }

    }
}