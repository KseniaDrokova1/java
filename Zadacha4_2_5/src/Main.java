import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;


public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        byte[] array = {1, 6, 4, 10};
        try (InputStream inputStream = new ByteArrayInputStream(array)) {
            System.out.println(main.sumOfStream(inputStream));
        } catch (IOException e) {
        }

    }

    public int sumOfStream(InputStream inputStream) throws IOException {
        int sum = 0;
        int i;
        while ((i = inputStream.read()) != -1) {
            sum += i;
            i++;
        }


        return sum;
    }
}

