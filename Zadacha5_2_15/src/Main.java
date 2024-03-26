import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Deque<Integer> integerDeque = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите последовательность целых чисел:");
        for (int n = 0; scanner.hasNextInt(); n++){
            if (n % 2 != 0){
                integerDeque.add(scanner.nextInt());
            }
            else scanner.next();
        }
        System.out.print("Результат:");
        int size = integerDeque.size();
        for(int i = 0; i < size; i++)
            System.out.print(integerDeque.removeLast()+" ");

    }
}