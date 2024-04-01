import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Ваш массив: " + Arrays.toString(array));
        DynamicArray<Integer> el = new DynamicArray<Integer>(array);
        System.out.println(el.get(5));

    }
    public static class DynamicArray<T> {
        private int size;
        private T[] el;
        public DynamicArray(T[] el) {
            this.el = (T[]) new Object[10];
        }
        public T get(int index) {
            if (index >= el.length || index < 0) {
                throw new ArrayIndexOutOfBoundsException();
            }
            return el[index];
        }
        public void add(T[] element) {
            if (size == element.length) {
                T[] el1 = (T[]) new Object[(element.length * 2)];
                System.arraycopy(element, 0, el1, 0, element.length);
            }
            size++;
        }
    }
}