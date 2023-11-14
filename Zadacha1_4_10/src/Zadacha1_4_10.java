import java.util.Scanner;

public class Zadacha1_4_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите день недели:");
        String weekday = in.next();
        System.out.print(isWeekend(weekday));
    }

    public static boolean isWeekend(String weekday) {
        boolean result;
        switch (weekday) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday":
                result = false;
                break;
            case "Saturday", "Sunday":
                result = true;
                break;
            default:
                result = false;
                break;
        }
        return result;
    }
}