
public class Zadacha1_2_7 {
    public static void main(String[] args) {
    double price = 12.5;
    int count = 2;
    double sum = priceCalculation(price, count);
    System.out.print("Сумма покупки: ");
    System.out.print(sum);

    }
    public static double priceCalculation(double price, int count) {
        double sum = price*count;
        return sum;
    }
}