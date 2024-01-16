
public class Main {
    public static String[] days;

    public static void main(String[] args) {
        String[] days = {"Monday", "Friday", "Sunday","Saturday" };
        DayWeek dayWeek = new DayWeek();
        System.out.println(DayWeek.isWeekend("Saturday"));
        System.out.println(DayWeek.weekendCount(days));
        System.out.println(DayWeek.weekdayCount(days));
    }
}