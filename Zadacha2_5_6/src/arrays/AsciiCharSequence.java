package arrays;

import java.util.stream.IntStream;

public class AsciiCharSequence implements CharSequence {

    private byte[] bytes;

    AsciiCharSequence(byte[] bytes) {
        this.bytes = bytes;
    }

    @Override
    public int length() {
        return bytes.length;
    }

    @Override
    public char charAt(int index) {
        return (char) bytes[index];
    }

    @Override
    public boolean isEmpty() {
        return CharSequence.super.isEmpty();
    }

    @Override
    public AsciiCharSequence subSequence(int start, int end) {
        byte[] byteArray = new byte[end - start + 1];

        int j = 0;

        for (int i = start; i <= end; i++) {
            byteArray[j++] = bytes[i];
        }

        return new AsciiCharSequence(byteArray);
    }

    @Override
    public String toString() {
        return new String(bytes);
    }

    @Override
    public IntStream chars() {
        return CharSequence.super.chars();
    }

    @Override
    public IntStream codePoints() {
        return CharSequence.super.codePoints();
    }
}