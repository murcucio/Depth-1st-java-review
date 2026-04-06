
class Person {
		 String name;
		 int age;
		 static int personCount = 0;       //클래스 변수이며 인스턴스 변수와 다르게 static이 붙음
		 
		public static void main(String[] args) {
		 Person.personCount = 10;
		 System.out.println(Person.personCount); // 10
		}

		public void introduce() {
			// TODO Auto-generated method stub
			
		}
}
