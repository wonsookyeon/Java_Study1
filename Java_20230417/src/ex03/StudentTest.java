package ex03;

class Student {
	String name;
	String address;
	int age;
	static int count; // static 을 붙여주면 공유변수가 된다. ↓ 밑에까지 적용됨

	void displayInfo() {
		count++;
		info();
		System.out.println(name + ", " + age + ", " + address + "현재 학생수 : " + count);
	}

	static void info() {

		count++;
		// displayInfo();
	}
}

public class StudentTest {

	public static void main(String[] args) {
		
		Student kim = new Student(); // 객체생성
		kim.name = "김씨요";
		kim.age = 20;
		kim.address = "수원이요 ";
		
		Student park = new Student(); // 객체생성
		park.name = "박씨요";
		park.age = 200;
		park.address = "천당이요 ";
				
		Student lee = new Student(); // 객체생성
		Student hong = new Student(); // 객체생성
		
		kim.displayInfo();
		park.displayInfo();
		lee.displayInfo();
		hong.displayInfo();

	}

}
