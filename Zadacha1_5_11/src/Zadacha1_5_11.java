import java.util.Arrays;

public class Zadacha1_5_11 {
    public static void main(String[] args) {
        int[] firstArray = new int[]{2, 3, 6, 8, 10};
        int[] secondArray = new int[]{1, 4, 5, 7, 9};
        int[] result = mergeAndSort(firstArray, secondArray);
        System.out.println(Arrays.toString(result));
    }

    public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
        int[] result = new int[firstArray.length + secondArray.length];
        int i = 0, j = 0, r = 0;
        while (i < firstArray.length && j < secondArray.length) {
            if (firstArray[i] < secondArray[j]) {
                result[r] = firstArray[i];
                i++;
            } else {
                result[r] = secondArray[j];
                j++;
            }
            r++;
        }
        if (i < firstArray.length) {
            System.arraycopy(firstArray, i, result, r, (firstArray.length - i));
        }
        if (j < secondArray.length) {
            System.arraycopy(secondArray, j, result, r, (secondArray.length - j));
        }
        return result;
    }
}