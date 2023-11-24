// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Zadacha1_5_3 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 5, 4, 3, 1, 0, 2, 12};
        printArray(arr);
    }

    static void printArray(int[] arr) {
        System.out.print("[");
        for (int i : arr) {
            if (i < arr.length) {
                System.out.print(i + ",");
            } else {
                System.out.print(i);
            }
        }
        System.out.print("]");
    }

}

