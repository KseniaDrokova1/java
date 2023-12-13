
import java.util.regex.Pattern;

public class Zadacha1_6_11 {
    public static void main(String[] args) {
        String email = "drokovaksenia@gmail.com";
        System.out.println(isGmailOrOutlook(email));
    }

    public static boolean isGmailOrOutlook(String email) {
        boolean a = false;
        if (email.matches("(.*)@gmail.com(.*)") || email.matches("(.*)@outlook.com(.*)")) {
            String[] name = email.split("@");
            String str = String.valueOf(name[0]);
            if (str.matches("[a-zA-Z0-9]*")) {
                a = true;
            }

        }
        return a;
    }
}