
public class Zadacha1_5_6 {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 5, 8, 10, 11};
        int[] inverse = inverseArray(numbers);
        int lastIndex = inverse.length - 1;
        int lastElement = inverse[lastIndex];
        System.out.print("[");
        for (int j = 0; j < inverse.length; j++) {
            if (j == lastIndex) {
                System.out.print(inverse[j] + "]");
            } else {
                System.out.print(inverse[j] + ",");
            }
        }
    }
    public static int[] inverseArray(int[] numbers) {
        int [] invertedArr = new int [numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            invertedArr[numbers.length - 1 - i] = numbers[i];
        }

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = invertedArr[i];
        }
        return invertedArr;
    }
}
