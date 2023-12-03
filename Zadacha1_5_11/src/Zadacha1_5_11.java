import java.util.Arrays;

public class Zadacha1_5_11 {
    public static void main(String[] args) {
            int[] firstArray = new int[]{2,3,1};
            int[] secondArray = new int[]{1, -1, 4, 5, 7, 9, 0};
            int[] result = mergeAndSort(firstArray, secondArray);
            System.out.println(Arrays.toString(result));
        }
        public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
            int[] result = new int[firstArray.length + secondArray.length];
            System.arraycopy(firstArray, 0, result, 0, firstArray.length);
            System.arraycopy(secondArray, 0, result, firstArray.length, secondArray.length);
            Arrays.sort(result);
            return result;
        }
    }