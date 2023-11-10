import java.math.BigInteger;

public class Zadacha1_2_14 {
    public static void main(String[] args) {
        BigInteger maxLong = BigInteger.valueOf(Long.MAX_VALUE);
        System.out.println(maxLongSqr(maxLong));


    }
    public static BigInteger maxLongSqr(BigInteger maxLong){
        return maxLong.multiply(maxLong);
    }

}