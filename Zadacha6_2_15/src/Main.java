import java.math.BigInteger;
import java.util.stream.*;


public class Main {
    public static void main(String[] args) {
        System.out.println(factorial(3));
    }
    public static BigInteger factorial(int value){
        if(value < 2 ) return BigInteger.valueOf(1);
        return IntStream.rangeClosed(2, value).mapToObj(BigInteger::valueOf).reduce(BigInteger::multiply).get();

    }
}