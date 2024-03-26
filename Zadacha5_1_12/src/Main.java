public class Main {
    public static void main(String[] args) {

    }

    public static class Box<T> {
        private T object;

        Box() {
            object = object;
        }

        public static <T> Box<T> getBox() {
            return new Box<>();
        }
    }

}
