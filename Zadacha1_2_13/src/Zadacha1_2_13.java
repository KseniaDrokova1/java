// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Zadacha1_2_13 {
    public static void main(String[] args) {
        double area = 10.0;
        double radius = calcCircleRaduis(area);
        System.out.printf("%.3f\n", radius);


    }
    public static double calcCircleRaduis(double area){
        double p = 3.14;
        double radius = Math.sqrt(area/p);
        return radius;
    }
}