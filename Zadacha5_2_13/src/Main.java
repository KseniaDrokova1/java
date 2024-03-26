import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> plenty1 = Set.of(1, 9, 3, 4);
        Set<Integer> plenty2 = Set.of(1, 5, 3, 2);


        System.out.println(symmetricDifference(plenty1, plenty2));

    }


public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {

    Set<T> result = new HashSet<>();

    result.addAll(set1);

    result.addAll(set2);

    Iterator<T> iterator = result.iterator();

    while (iterator.hasNext()) {

        T item = iterator.next();

        if (set1.contains(item) && set2.contains(item)) {

            iterator.remove();

        }

    }

    return result;

}
}