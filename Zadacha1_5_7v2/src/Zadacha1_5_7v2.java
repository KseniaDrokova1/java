
public class Zadacha1_5_7v2 {

    public static void main(String[] args) {
        int[] firstArray = {5, 4, 6, 2, 1};
        int[] secondArray = {2, 5, 8, 4, 1, 6, 4};
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
        int length1 = firstArray.length;
        int length2 = secondArray.length;
        int[] res = new int[length1 + length2];
        int a = 1;
        for (int i = 0; i < length1; i++) {

            res[i] = firstArray[i];
        }
        for (int i = 0; i < length2; i++) {
            res[length1 - 1 + a] = secondArray[i];
            a++;
        }

        int l = res.length;
        int[] temp = new int[l];
        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j < l; j++) {
                if (res[i] > res[j]) {
                    temp[i] = res[i];
                    res[i] = res[j];
                    res[j] = temp[i];
                }
            }
        }

        return res;
    }
}




