
public class Zadacha1_6_10 {
    public static void main(String[] args) {
        String number = "12342356";
        Zadacha1_6_10 myObject = new Zadacha1_6_10();
        myObject.parseAndSqrt(number);
    }

    public long parseAndSqrt(String number) {
        long number1 = Long.parseLong(number);
        long result = (Math.round(Math.sqrt(number1)));
        System.out.println(result);
        return result;
    }
}