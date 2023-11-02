// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Zadacha126 {

        public static void main(String[] args) {
            int monitors = 15;
            int programmers = 6;
            int ostatok = drawisMonitorsCounter(monitors, programmers);
            System.out.print(ostatok);
        }
         public static int drawisMonitorsCounter(int monitors, int programmers) {
            int ostatok = monitors%programmers;
            return ostatok;
        }
    }

