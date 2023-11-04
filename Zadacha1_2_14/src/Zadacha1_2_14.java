import java.math.BigInteger;

public class Zadacha1_2_14 {
    public static void main(String[] args) {
        BigInteger maxLong = BigInteger.valueOf(Long.MAX_VALUE);
        BigInteger max = maxLongSqr(maxLong);
        System.out.println(max);


    }
    public static BigInteger maxLongSqr(BigInteger maxLong){
        BigInteger max = maxLong.multiply(maxLong);
        return max;
    }

}