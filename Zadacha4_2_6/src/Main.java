import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        byte[] inputArray = {1, 2, 4, 10, 5, 6, 3, 16, 19, 21};

        try (InputStream inputStream = new ByteArrayInputStream(inputArray); OutputStream outputStream = new ByteArrayOutputStream()) {
        main.print(inputStream, outputStream);
        } catch (IOException e) {
        }
    }
    public void print(InputStream inputStream, OutputStream outputStream) throws IOException {

        int i = inputStream.read();
        while (i != -1) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                outputStream.write(i);
                outputStream.flush();
            }
            i = inputStream.read();
        }
    }
}