
public class Solution {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        dog.catchCat();
        dog.sayHello();
        cat.sayHello();
    }

    public static class Cat {
        public void sayHello() {
            System.out.println("Мяу!");
        }
    }

    public static class Dog {
        public void sayHello() {

            System.out.println("Гав!");
        }

        public void catchCat() {
            System.out.println("Кошка поймана");

        }
    }
}
