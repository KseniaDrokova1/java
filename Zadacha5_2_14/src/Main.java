
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("C://Users//droko//IdeaProjects//Zadacha5_2_14//src//clients.txt");
        System.out.println(getSalesMap(reader));
    }


    public static Map<String, Long> getSalesMap(Reader reader) throws IOException {
        Map<String, Long> res = new HashMap<>();
        Scanner scanner = new Scanner(reader);
        while (scanner.hasNext()) {
            for (String string : scanner.nextLine().split(", ")) {
                int index = string.indexOf(" ");
                String key = string.substring(0, index);
                Long sum = Long.valueOf(string.substring(index + 1, string.length()));
                res.put(key, res.containsKey(key) ? res.get(key) + sum : sum);
            }
        }
        return res;
    }
}