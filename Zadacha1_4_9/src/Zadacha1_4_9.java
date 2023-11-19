public class Zadacha1_4_9 {
    public static void main(String[] args) {
        int age = 10;
        Zadacha1_4_9 first = new Zadacha1_4_9();
        first.determineGroup(age);
        System.out.println(first.determineGroup(age));

    }

    public int determineGroup(int age) {
        if (7 <= age && age <= 13) {
            return 1;
        } else if (14 <= age && age <= 17) {
            return 2;
        } else if (18 <= age && age <= 65) {
            return 3;
        } else {
            return -1;
        }

    }
}