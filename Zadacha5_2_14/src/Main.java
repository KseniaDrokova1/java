import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = Files.newBufferedReader(Paths.get("src/resources/clients.txt"));
        System.out.println(getSalesMap(reader));
    }


    public static Map<String, Long> getSalesMap(BufferedReader reader) throws IOException {
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