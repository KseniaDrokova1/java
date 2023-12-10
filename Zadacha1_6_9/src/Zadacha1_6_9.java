
public class Zadacha1_6_9 {
    public static void main(String[] args) {
        String text = "Уж редко рукою окурок держу.";
        text = text.toLowerCase();
        boolean result = isPalindrome(text);
        System.out.println(result);

    }


    public static boolean isPalindrome(String text) {

        String str = "";

        text = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        boolean result = false;

        for (int i = text.length() - 1; i >= 0; i--) {
            str = str + text.charAt(i);
        }

        if (text.equals(str)) {
            result = true;
        }
        return result;
    }
}
