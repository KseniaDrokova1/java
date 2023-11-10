// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Zadacha1_2_13 {
    public static void main(String[] args) {
        double area = 10.0;
        System.out.printf("%.3f\n", calcCircleRaduis(area));


    }
    public static double calcCircleRaduis(double area){
        return Math.sqrt(area/Math.PI);
    }
}