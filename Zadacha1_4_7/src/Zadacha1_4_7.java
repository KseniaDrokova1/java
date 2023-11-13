import java.math.BigInteger;

public class Zadacha1_4_7 {
    public static void main(String[] args) {
        int value = 4;
        System.out.println(value + ":" + factorial(value));
    }

    public static BigInteger factorial(int value) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= value; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;

    }
}