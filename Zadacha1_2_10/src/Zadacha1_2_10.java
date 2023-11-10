
public class Zadacha1_2_10 {
    public static void main(String[] args) {
        double a = 10.2;
        double b = 5.6;
        double c = 20.1;
        System.out.print(doubleExpression(a,b,c));

    }
        public static boolean doubleExpression(double a, double b, double c) {
            return (Math.abs(a + b) == c);
        }
}
