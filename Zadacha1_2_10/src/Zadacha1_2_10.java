
public class Zadacha1_2_10 {
    public static void main(String[] args) {
        double a = 10.0;
        double b = 5.0;
        double c = 15.0;
        System.out.print(doubleExpression(a,b,c));

    }
        public static boolean doubleExpression(double a, double b, double c) {
        return Math.abs(a + b - c) <= 0.0001;
        }
}
