import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> plenty1 = Set.of(1, 9, 3, 4);
        Set<Integer> plenty2 = Set.of(1, 5, 3, 2);
        System.out.println(symmetricDifference(plenty1, plenty2));

    }


    public static <T> Set<T> symmetricDifference(Set<? extends T> plenty1, Set<? extends T> plenty2) {

        Set<T> result = new HashSet<>(plenty1);
        result.removeAll(plenty2);
        Set<T> result1 = new HashSet<>(plenty2);
        result1.removeAll(plenty1);
        result.addAll(result1);

        return result;
    }
}