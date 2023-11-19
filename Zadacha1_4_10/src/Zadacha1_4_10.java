

public class Zadacha1_4_10 {
    public static void main(String[] args) {

        String weekday = "Tuesday";
        System.out.print(isWeekend(weekday));
    }

    public static boolean isWeekend(String weekday) {

        switch (weekday) {
            case "Saturday", "Sunday":
                return true;

            default:
                return false;

        }

    }
}
