import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.sqrt().apply(9));

    }

    public UnaryOperator sqrt() {
        UnaryOperator <Integer> unaryOperator = n -> n*n;
        return unaryOperator;

    }
}