
public class Zadacha1_5_7 {
    public static void main(String[] args) {

        int[] firstArray = new int[]{1, 2, 5, 8, 10, 11};
        int[] secondArray = new int[]{1, 3, 6};
        int[] result = mergeAndSort(firstArray, secondArray);
        int lastIndex = result.length - 1;
        int lastElement = result[lastIndex];
        System.out.print("[");
        for (int j = 0; j < result.length; j++) {
            if (j == lastIndex) {
                System.out.print(result[j] + "]");
            } else {
                System.out.print(result[j] + ",");
            }
        }
    }


    public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {

        int firstArrayLength = firstArray.length;
        int secondArrayLength = secondArray.length;

        int[] arr = new int[firstArrayLength + secondArrayLength];

        int firstArrayPosition, secondArrayPosition, mergedPosition;
        firstArrayPosition = secondArrayPosition = mergedPosition = 0;

        while (firstArrayPosition < firstArrayLength && secondArrayPosition < secondArrayLength) {
            if (firstArray[firstArrayPosition] < secondArray[secondArrayPosition]) {
                arr[mergedPosition++] = firstArray[firstArrayPosition++];
            } else {
                arr[mergedPosition++] = secondArray[secondArrayPosition++];
            }
        }

        while (firstArrayPosition < firstArrayLength) {
            arr[mergedPosition++] = firstArray[firstArrayPosition++];
        }

        while (secondArrayPosition < secondArrayLength) {
            arr[mergedPosition++] = secondArray[secondArrayPosition++];
        }

        return arr;
    }

}