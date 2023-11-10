
public class Zadacha1_2_7 {
    public static void main(String[] args) {
        double price = 13.7;
        int count = 2;
        System.out.print("Сумма покупки: " + priceCalculation(price, count));
    }
    public static double priceCalculation(double price, int count) {
        return (price * count);
    }
}