public class Main  {
    public static void main(String[] args) {
        System.out.println(getGenerator().cond(-5));
        System.out.println(getGenerator().cond(5.5));
    }
    public static NumberGenerator<? super Number> getGenerator() {
        return n -> n.intValue() > 0;
    }

}