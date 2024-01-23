public class Main {

    public static void main(String[] args)  {
        int number = -5;
        Main main = new Main();
        main.testExp(number);

    }

    public void testExp(int number) throws MyNewException{
    if (number > 0) {
        System.out.println("Число больше 0");
    }else {
        throw new MyNewException("Число меньше 0");
    }
}

}