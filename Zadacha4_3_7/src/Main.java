import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        String text = "";
        double summ = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текст:");
        while (true) {
            String str = scanner.nextLine();
            if (str.equals("") == true) break;
            else text += str + " ";

            String[] arrayString = text.split("\\s");
            for (int i = 0; i < arrayString.length; i++) {
                double number = 0;
                try {
                    number = Double.parseDouble(arrayString[i]);
                } catch (Exception e) {

                }
                if (number != 0) summ += number;
            }

            System.out.println("Сумма вещественных чисел: " + String.format("%.6f", summ));
        }
    }
}
