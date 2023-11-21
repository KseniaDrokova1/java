
public class Zadacha1_4_12 {
    public static void main(String[] args) {
        String weekday = "Sunday";
        System.out.print(isWeekend(weekday));
    }
    public static String isWeekend(String weekday) {
        String result;
        result = (weekday == "Saturday")|(weekday == "Sunday") ? "Ура, выходной!":"Надо еще поработать";
        return result;
    }
}