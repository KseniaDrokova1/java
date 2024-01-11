package arrays;

import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        AsciiCharSequence asciiCharSequence = new AsciiCharSequence("125673".getBytes(StandardCharsets.UTF_8));
        System.out.println(asciiCharSequence.charAt(1));
        AsciiCharSequence asciiCharSequence1 = asciiCharSequence.subSequence(0, 1);
        System.out.println(asciiCharSequence);
    }
}
