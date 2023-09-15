public class floyds_triangle {
    public static void floyds_triangle(int n){
        int counter = 1;
        for(int i=1;i<=n;i++){
            //inner how many time it will print
            for(int j=1;j<=i;j++){
                System.out.print(counter+" ");
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        floyds_triangle(5);
    }
}
