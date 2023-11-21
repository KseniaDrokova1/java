public class Zadacha1_4_11 {
    public static void main(String[] args) {

        String weekday = "Saturday";
        System.out.print(isWeekend(weekday));
    }

    public static boolean isWeekend(String weekday) {

        if (weekday.equals("Saturday")|(weekday.equals("Sunday"))) {
            return true;
        } else {
            return false;
        }

    }
}