
public class Main {
    public static void main(String[] args) {
        try (Car car = new Car()) {
            car.drive();
        }
    }
    
    public static class Car implements AutoCloseable {

        public void close() {
            try {
                System.out.println("Машина закрывается...");
            } catch (RuntimeException ignore) {

            }
        }

        public void drive() {
            try {
                System.out.println("Машина поехала.");
            } catch (RuntimeException ignore) {

            }
        }
    }

}



