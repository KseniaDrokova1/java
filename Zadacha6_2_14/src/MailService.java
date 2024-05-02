import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

class MailService<T> implements Box<T> {
    private Map<String, List<T>> mailBox = new HashMap<>();

    @Override
    public void put(T item) {
        String to = ((MailMessage)item).getTo();
        mailBox.computeIfAbsent(to, k -> new ArrayList<>()).add(item);
        mailBox.computeIfAbsent(to, k -> new ArrayList<>()).add(item);
    }

    @Override
    public Map<String, List<T>> getMailBox() {
        return mailBox;
    }
}
