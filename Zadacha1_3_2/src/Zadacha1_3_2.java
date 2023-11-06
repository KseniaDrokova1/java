import java.beans.PropertyEditorSupport;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Zadacha1_3_2 {
    public static void main(String[] args) {
        int a = 10;
        char res = charExpression(a);
        System.out.println(res);

    }
    public static char charExpression(int a) {
        char simvol = '\\';
        char res = (char)((int)simvol+a);
        return res;

    }
}