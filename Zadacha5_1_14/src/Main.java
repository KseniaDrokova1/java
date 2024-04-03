import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {

        DynamicArray<Integer> el = new DynamicArray<>();
        el.add(1);
        el.add(2);
        el.add(3);
        el.add(4);
        el.add(5);
        el.add(6);
        el.add(7);
        el.add(8);
        el.add(9);
        el.add(10);
        el.add(11);
        el.add(12);
        System.out.println(el.get(11));
        el.remove(10);
        System.out.println(el.get(10));

    }


    public static class DynamicArray<T> {
        private T[] el1 = (T[]) new Object[10];
        private int size = 0;

        public  T get(int index) {
            if (index < 0 || index >= size) {
                throw new ArrayIndexOutOfBoundsException();
            }
            return (T) el1[index];
        }

        public void add(T el) {
            if (size == el1.length) {
                el1 = Arrays.copyOf(el1, el1.length * 2);
            }
            el1[size++] = el;
        }

        public void remove(int index) {
            System.arraycopy(el1, index + 1, el1, index, size - index - 1);
            size--;
        }


    }
}
