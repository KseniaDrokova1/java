import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;


public class Main {
    public static void main(String[] args) {
        byte[] array = {48, 49, 50, 51};
        InputStream inputStream = new ByteArrayInputStream(array);
        Charset charset = Charset.forName("ASCII");
        try  {
            System.out.println(readAsString(inputStream, charset));
        } catch (IOException e) {

        } finally {
            try {
                inputStream.close();
            }catch (Exception e){

            }

        }

    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        InputStreamReader streamReader = new InputStreamReader(inputStream, charset);
        StringBuffer stringBuffer = new StringBuffer();
        int i;
        String result;
        while ((i = streamReader.read()) != -1) {
            stringBuffer.append((char) i);
        }
        result = stringBuffer.toString();
        return result;
    }
}