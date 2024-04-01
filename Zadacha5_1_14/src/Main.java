import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws Exception {

        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Ваш массив: " + Arrays.toString(array));
        DynamicArray <Integer> el = new DynamicArray<>();

        System.out.println(el.get(1));
//        Integer i = el.get(1);
//        System.out.println(i);


    }
    public static class DynamicArray<T>  {
        private int size;
        private T[] el = (T[]) new Object[10];
        public DynamicArray(){

        }

        public T get(int index) {
            if (index >= size || index < 0) {
                throw new ArrayIndexOutOfBoundsException();
            }
            return (T) el[index];
        }
        public void add(T[] element) {
            if (size == element.length) {
                T[] el1 = (T[]) new Object[(element.length * 2)];
                System.arraycopy(element, 0, el1, 0, element.length);
            }
            size++;
        }
        public void remove(T[] es, int index){
            final int newSize;
            if ((newSize = size - 1) > index)
                System.arraycopy(es, index + 1, es, index, newSize - index);
            es[size = newSize] = null;
        }
    }
}
