
public class Zadacha1_5_12 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 3, 4, 5, 6, 7};
        printOddNumbers(arr);
    }

    public static void printOddNumbers(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                if (i != 0) {
                    System.out.print(",");
                }
                System.out.print(arr[i]);

            }
        }
        System.out.println();
    }
}