public class Main3 {
    static class Person {
        public void introduce() {
            System.out.println("사람입니다");
        }
    }

    static class Student extends Person {
        String school;

        @Override
        public void introduce() {
            System.out.println("학생입니다");
        }
    }

    public static void main(String[] args) {
        Person person = new Person();
        Person student = new Student(); // 다형성: Person 타입으로 Student 참조

        person.introduce();   // 사람입니다
        student.introduce();  // 학생입니다
    }
}
