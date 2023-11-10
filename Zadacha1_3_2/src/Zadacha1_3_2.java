import java.beans.PropertyEditorSupport;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Zadacha1_3_2 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(charExpression(a));

    }
    public static char charExpression(int a) {
        char simvol = '\\';
        return (char) ((int)simvol+a);

    }
}