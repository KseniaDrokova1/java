public class DayWeek {
    public enum dayName {

        Sunday,
        Monday,
        Tuesday,
        Wednesday,
        Thursday,
        Friday,
        Saturday
    }
    public static String[] days;
    public static void Days(){
        days = Main.days;
    }

    public static boolean isWeekend(String dayName) {
        if ((dayName.equals("Sunday")) || (dayName.equals("SATURDAY"))) {
            return true;
        } else {
            return false;
        }
    }

    public static int weekendCount(String[] days) {
        int weekend = 0;
        for (String day : days) {
            if (isWeekend(day)) {
                weekend++;
            }
        }
        return weekend;
    }

    public static int weekdayCount(String[] days) {
        int weekday = days.length;
        for (String day1 : days) {
            if (isWeekend(day1)) {
                weekday--;
            }
        }
        return weekday;
    }
}
