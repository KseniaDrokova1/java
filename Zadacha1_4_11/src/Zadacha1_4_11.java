public class Zadacha1_4_11 {
    public static void main(String[] args) {

        String weekday = "Monday";
        System.out.print(isWeekend(weekday));
    }

    public static boolean isWeekend(String weekday) {

        if (weekday == "Saturday") {
            return true;
        } else if (weekday == "Sunday") {
            return true;
        } else {
            return false;
        }

    }
}