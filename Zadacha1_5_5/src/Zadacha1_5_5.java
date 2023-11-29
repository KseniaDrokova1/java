
public class Zadacha1_5_5 {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4, 5};
        int[] arr = getArrayMiddle(numbers);
        int lastIndex = arr.length - 1;
        int lastElement = arr[lastIndex];
        System.out.print("[");
        for (int j = 0; j < arr.length; j++) {
            if (j == lastIndex) {
                System.out.print(arr[j] + "]");
            } else {
                System.out.print(arr[j] + ",");
            }
        }

    }

    public static int[] getArrayMiddle(int[] numbers) {
        if (numbers.length > 2) {
            if (numbers.length % 2 == 0) {
                int[] arr = new int[2];
                arr[0] = numbers[numbers.length / 2 - 1];
                arr[1] = numbers[numbers.length / 2];
                return arr;
            } else {
                int[] arr1 = new int[1];
                arr1[0] = numbers[numbers.length / 2];
                return arr1;
            }
        } else {
            return numbers;
        }
    }
}