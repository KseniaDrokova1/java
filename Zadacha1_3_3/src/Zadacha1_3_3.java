public class Zadacha1_3_3 {
    public static void main(String[] args) {
        byte age1 = 10;
        byte age2 = 7;
        byte raznitca = getAgeDiff(age1,age2);
        System.out.println("Разница в возрасте " +raznitca);
    }
    public static byte getAgeDiff(byte age1, byte age2) {
       byte raznitca = (byte) (age1-age2);
       return raznitca;


    }
}