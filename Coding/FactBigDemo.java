import java.math.BigInteger;

public class FactBigDemo {
    public static void main(String[] args) {
        
        int n = 25;
        BigInteger fact = BigInteger.ONE;
        
        for(int i=2;i<=n;i++){
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println(fact);
    }
}
