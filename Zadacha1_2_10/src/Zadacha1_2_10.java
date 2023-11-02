
public class Zadacha1_2_10 {
    public static void main(String[] args) {
        double a = 10.2;
        double b = 5.6;
        double c = 20.1;
        boolean x = doubleExpression(a,b,c);
        System.out.print(x);

    }
        public static boolean doubleExpression(double a, double b, double c) {
            boolean x = Math.abs(a + b) == c;
            return x;
        }
}