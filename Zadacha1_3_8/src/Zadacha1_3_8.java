
public class Zadacha1_3_8 {
    public static void main(String[] args) {
        int chislo  = 16;
        System.out.println(chislo +":" + isPowerOfTwo(chislo));
    }
    public static boolean isPowerOfTwo(int chislo){
         int modul = Math.abs(chislo);
         return Integer.bitCount(modul) == 1 ? true: false;
    }
}