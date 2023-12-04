import java.util.Arrays;

public class Zadacha1_5_10 {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 10};
        int[] result = getArrayMiddle(numbers);
        System.out.println(Arrays.toString(result));
    }

    public static int[] getArrayMiddle(int[] numbers) {
        int left = (numbers.length - 1) / 2;
        int right = numbers.length == 0 ? 0 : left + 2 - numbers.length % 2;
        return Arrays.copyOfRange(numbers, left, right);
    }
}