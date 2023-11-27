
public class Zadacha1_5_4 {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 5, 8, 10, 11};
        int start = 3;
        int end = 10;

        System.out.print(getSubArrayBetween(numbers,start,end));

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
            System.out.print(finalArray[number1]);
        }
        return finalArray;
    }
}