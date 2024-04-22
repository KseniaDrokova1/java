
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        IntStream intStream = pseudoRandomStream(13);
        intStream.forEach(System.out :: println);
    }

    public static IntStream pseudoRandomStream(int seed) {
        return IntStream.iterate(seed, p -> ((p * p) / 10) % 1000);
    }
}