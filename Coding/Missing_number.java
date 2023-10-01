public class Missing_number {
    public static void main(String[] args) {
        int a[]={0,1,4,6,3,5};
        int n=a.length;

        int first = (n*(n+1))/2;
        int arraySum=0;
        for(int ele:a)
        {
            arraySum=arraySum+ele;
        }
        System.out.println(first-arraySum);//sum of n no.s - sum of array
    }
}
