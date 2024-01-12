// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static String[] days;

    public static void main(String[] args) {
        String[] days = {"Monday", "Friday", "Sunday"};
        DayWeek dayWeek = new DayWeek();
        System.out.println(DayWeek.isWeekend("Sunday"));
        System.out.println(DayWeek.weekendCount(days));
        System.out.println(DayWeek.weekdayCount(days));
    }
}