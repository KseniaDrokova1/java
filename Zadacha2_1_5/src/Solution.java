
public class Solution {


    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        dog.catchCat(cat);
    }

    public static class Cat {
        Cat() {
            sayHello();
        }

        public void sayHello() {
            System.out.println("Мяу!");
        }
    }

    public static class Dog {
        Dog() {
            sayHello();
        }

        public void sayHello() {
            System.out.println("Гав!");
        }

        public void catchCat(Cat cat) {
            System.out.println("Кошка поймана");
            sayHello();
            cat.sayHello();
        }
    }
}

