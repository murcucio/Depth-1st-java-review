class Person {
  public void introduce() {
    System.out.println("사람입니다");
  }
}

class Student extends Person {
  public void introduce() {
    System.out.println("학생입니다");
  }
}

public class p2 {
  public static void main(String[] args) {
    Person person = new Person();
    Student student = new Student();  // Student 를 Person이라 바꿀수 있음.
    person.introduce();
    student.introduce();
  }
}
  