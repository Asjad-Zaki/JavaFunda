import java.util.Arrays;

public class MoveZeros {// move zeros to the end of the array
    public static void main(String[] args) {
        
        int a[] = {3,5,0,0,4};

        int nz =  0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=0)
            {
                a[nz]=a[i];
                nz++;
            }
        }
        for(int i=nz;i<a.length;i++)
           a[i]=0;
           System.out.println(Arrays.toString(a));
    }
}
