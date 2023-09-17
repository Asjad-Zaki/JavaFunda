import java.util.*;
public class smallestnumber {
    public static int getsmallest(int numbers[]){
        int smallest = Integer.MAX_VALUE;//-infinity
        
        for(int i=0; i<numbers.length; i++){
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        return smallest;

    }
    public static void main(String[] args) {
        int numbers[]={1,2,3,6,5,4};
        System.out.println("smallest value is :"+ getsmallest(numbers));
    }

}
