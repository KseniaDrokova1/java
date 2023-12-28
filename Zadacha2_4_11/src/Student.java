public class Student {
        protected final String studying;

        protected Student(String work) {

            this.studying = work;
        }

        public Student() {

            this.studying = "Прохожу курс по Java.";
        }

        public void study() {

            System.out.println("Я очень занят. " + studying);
        }

}
