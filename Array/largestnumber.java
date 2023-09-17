import java.util.*;
public class largestnumber {
    public static int getlargest(int numbers[]){
        int largest = Integer.MIN_VALUE;//-infinity
        
        for(int i=0; i<numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;

    }
    public static void main(String[] args) {
        int numbers[]={1,2,3,6,5,4};
        System.out.println("Largest value is :"+ getlargest(numbers));
    }

}
