
public class Zadacha1_6_8 {
    public static void main(String[] args) {
        String str = "500";
        Zadacha1_6_8 myObject = new Zadacha1_6_8();
        myObject.parseAndPrintNumber(str);
    }

    public void parseAndPrintNumber(String str) {
        int y = (Integer.parseInt(str)) / 2;
        System.out.println(y);
    }
}