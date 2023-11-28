
public class Zadacha1_5_3 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 5, 4, 3, 1, 0, 2, 12};
        printArray(arr);
    }

    static void printArray(int[] arr) {
        System.out.print("[");
        int lastIndex = arr.length -1;
        int lastElement = arr[lastIndex];
        for (int i : arr) {
            if (i == lastElement) {
                System.out.print(i + "]");
            } else {
                System.out.print(i + "," );
            }
        }

    }

}

