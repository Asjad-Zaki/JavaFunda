import java.util.Scanner;
public class nestedforloop {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows :");

        int rows = sc.nextInt();

        System.out.println("Enter no of colums :");

        int colums = sc.nextInt();

        System.out.println("Enter no of Symbols  :");
        String symbol = "";
        symbol = sc.next();

        for(int i=1;i<=rows;i++){
            System.out.println();

            for(int j=1;j<=colums;j++){
                System.out.print(symbol);

            }
        }
         



    }
}