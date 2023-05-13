package ex07;

class 사람{  // 상위클래스
	String name;
	int age;
	
	public 사람(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void info() {
		System.out.println(name + "," + age);
	}
}
class 구본우 extends 사람{ // class 사람을 상속한다.  // 하위클래스
	double weight;
	
	public 구본우(String name, int age, double weight) {
		super(name,age);  // 상위클래스인 사람 class 3줄로
		this.weight = weight;
	}
	void display() {
//		System.out.println(name + ", " + age + ", " + weight);
	}
}

class 추명선 extends 사람 {
	double height;
	
	public 추명선(String name, int age, double height) {
		super(name,age);
		this.height = height;
	}
	
	void display() {
//		System.out.println(name + ", " + age + ", " + height);
	}
}

//class 박종진 extends 사람 {
//	String grade; // 학점
//	
//	public 박종진(String name, int age, String grade) {
//		this.name = name;
//		this.age = age;
//		this.grade = grade;
//	}
//	
//	void display() {
////		System.out.println(name + ", " + age + ", " + grade);
//	}
//}


public class StudentExam {

	public static void main(String[] args) {
		
		구본우 구 = new 구본우("로이", 11, 120);  // 19줄로 올라가서 입력
		구.info();
		
		
//		구.age = 100;
//		구.name = "로이";
//		구.weight = 89;
//		구.info();
		
		추명선 추 = new 추명선("까미",11,178.5);
		추.info();
	}

}
