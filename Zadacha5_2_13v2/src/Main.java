import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> plenty1 = new HashSet<>();
        Set<Integer> plenty2 = new HashSet<>();
        plenty1.add(5);
        plenty1.add(7);
        plenty1.add(6);
        plenty1.add(1);
        plenty1.add(2);
        plenty2.add(1);
        plenty2.add(2);
        plenty2.add(4);
        plenty2.add(3);
        plenty2.add(5);
        System.out.println(symmetricDifference(plenty1, plenty2));
    }

    public static <T> Set<T> symmetricDifference(Set plenty1, Set plenty2) {
        Set<T> result = new HashSet<>(plenty1);
        result.retainAll(plenty2);
        plenty1.addAll(plenty2);
        plenty1.removeAll(result);
        return plenty1;
    }
}
