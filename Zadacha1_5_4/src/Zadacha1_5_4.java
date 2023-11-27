
public class Zadacha1_5_4 {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 5, 8, 10, 11};
        int start = 4;
        int end = 12;
        int [] arr = getSubArrayBetween(numbers, start, end);
        System.out.print("[");
        for (int j=0; j < arr.length;j++ ){

            System.out.print(arr[j] + " ");
        }
        System.out.print("]");


    }
    public static int[] getSubArrayBetween(int[] numbers, int start, int end) {

        int number = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > start  && numbers[i] < end ) {
                number ++;
            }
        }

        int number1 = 0;
        int finalArray[] = new int[number];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > start  && numbers[i] < end ) {
                finalArray[number1] = numbers[i];
                number1++;
            }

        }
        return finalArray;
    }
}