import java.math.BigInteger;

public class Zadacha1_4_8 {
    public static void main(String[] args) {
        int value = 5;
        System.out.println(value + ":" + factorial(value));
    }

    public static BigInteger factorial(int value) {
        if (value <= 1) {return BigInteger.ONE;}
        return BigInteger.valueOf(value).multiply(factorial(value - 1));

    }
}