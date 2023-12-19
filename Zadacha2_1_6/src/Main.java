
public class Main {

    public static void main(String[] args) {
        System.out.println(Day.MONDAY.isWeekend());
        System.out.println(Day.MONDAY.getRusName());
    }

    public enum Day {
        MONDAY("Понедельник", false),
        TUESDAY("Вторник", false),
        WEDNESDAY("Среда", false),
        THURSDAY("Четверг", false),
        FRIDAY("Пятница", false),
        SATURDAY("Суббота", true),
        SUNDAY("Воскресенье", true);

        String rusName;
        boolean isWeekend;

        Day(String rusName, boolean isWeekend) {
            this.rusName = rusName;
            this.isWeekend = isWeekend;
        }

        public boolean isWeekend() {
            return isWeekend;
        }

        public String getRusName() {
            return rusName;
        }

    }
}
