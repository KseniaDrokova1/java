import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Stream<Integer> stream = new ArrayList<>(Arrays.asList(10,-1,9,1,0,5,7,11)).stream();
        main.findMinMax(
                stream,
                (x, y) -> x.compareTo(y),
                (x, y) -> System.out.println(String.format("min: %s max: %s", x, y))
        );


    }

    public <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {
        List<T> array = stream.sorted(order).collect(Collectors.toList());
        if (!array.isEmpty()) {
            minMaxConsumer.accept(array.get(0), array.get(array.size() - 1));

        } else {
            minMaxConsumer.accept(null, null);
        }
    }
}