public class Zadacha1_3_3 {
    public static void main(String[] args) {
        byte age1 = 10;
        byte age2 = 7;
        System.out.println("Разница в возрасте " + getAgeDiff(age1,age2));
    }
    public static byte getAgeDiff(byte age1, byte age2) {
       return (byte) (age1 - age2);
    }
}