import java.util.List;
import java.util.Map;

interface Box<T> {
    void put(T item);
    Map<String, List<T>> getMailBox();
}