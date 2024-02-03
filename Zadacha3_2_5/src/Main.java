
public class Main {
    public static void main(String[] args) {
        try (Car car = new Car()) {
            Car.drive();
        } catch (RuntimeException ignore) {
        }
    }


    public static class Car implements AutoCloseable {

        public void close() {
            try {
                System.out.println("Машина закрывается...");
            } catch (RuntimeException ignore){

            }
        }

        public static void drive() {

            System.out.println("Машина поехала.");
        }
    }

}



