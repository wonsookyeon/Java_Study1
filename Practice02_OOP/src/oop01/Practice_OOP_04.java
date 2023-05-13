package oop01;
// 객체 생성시 초기값을 생성자 메서드에서 설정하는 클래스를 구현해보시오.

class Person{
	
	// 1. 속성(Attribute)
	int age; // 나이
	String name; // 이름
	
	// 2. 생성자(Constructor)  // 생성자는 반환되는 리턴값이 없다.
	Person() {} // 받는 인자값이 없는 생성자 메서드 // 생략가능

	Person(int age, String name) { // 받는 인자값이 있는 생성자 메서드 // 오버로딩 가능(인자값이 다른 여러개의 생성자 가능)
		this.age = age;    // this 는 자기자신, self를 의미
		this.name = name;
	}
	
	// 3. 메서드(Method)
	void printPerson() {
		System.out.println("나이 : " + age + " 이름 : " + name);
	}
	
}

public class Practice_OOP_04 {

	public static void main(String[] args) {
		
		// 1. 객체 생성
		Person p1 = new Person(20, "홍길동");   // p1은 주소값, 안에 20,홍길동이 있다.
//		System.out.println(p1);  // p1의 주소값
//		System.out.println(p1.age); // 20
//		System.out.println(p1.name); // 홍길동
		p1.printPerson();
		
		Person p2 = new Person(30, "이순신");
		p2.printPerson();
		
		

	}

}
