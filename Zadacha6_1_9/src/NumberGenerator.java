@FunctionalInterface
interface NumberGenerator<T extends Number> {
    boolean cond(T arg);

}


