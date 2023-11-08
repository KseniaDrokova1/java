// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Zadacha1_3_8 {
    public static void main(String[] args) {
        int chislo  = 16;
        boolean result = isPowerOfTwo(chislo);
        System.out.println(chislo +":"+result);

    }
    public static boolean isPowerOfTwo(int chislo){
         int modul = Math.abs(chislo);
         boolean result = Integer.bitCount(modul) == 1 ? true: false;
         return result;
    }
}