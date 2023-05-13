
/* 1. 상속(Inheritance)이란?
 *  말 그대로 부모클래스가 가지고 있는 속성(변수)들과 동작/기능(메서드) 들을 그대로 물려받아 새로운 클래스를 만드는 것.
 *  상속을 활용하면 물려받은 것들은 그대로 쓰면 되고, 거기에 덧붙여 새로운 것만 만들면 되므로 그만큼 노력과 시간이 세이브됨.
 *  이때, 물려받게 되는 원본 클래스를 부모 클래스(Parent class) 또는 슈퍼클래스(Super class)라고 부른다.
 *  상속받아 새롭게 만들어진 클래스는 말 그대로 자식 클래스(Child class) 또는 서브/하위클래스(Sub class)라고 부른다.
 *  또 다른 표현으로는 기초/기반클래스(Base class), 파생클래스(Derived class)라고도 부른다. --> Derived : (a)유래된, 파생된
 */
/* 2. 상속의 장점
 *  가장 큰 장점 --> 재활용성
 *  완전히 새로운 것을 만드는 것이 아니라 기존 부모로 부터 상속을 받아 필요한 것만 추가로 더해서 만드는 것.
 *  부모 클래스에 정의되어져 있는 멤버변수(속성)나 메서드 들을 그대로 상속받아 사용하면 된다.
 *  상속받은 메서드라 해도 필요에 따라 자식클래스에서 용도를 변경해서 사용하는 것도 가능
 */

/* 3. 상속의 사용
 *  기존 부모클래스를 확장한다는 개념 --> extends 키워드 사용
 *  부모클래스의 멤버변수, 메서드는 상속이 가능하나 생성자는 상속이 안된다. ★
 *  부모클래스의 접근제한자 private 인 경우에는 아무리 자식클래스가 상속을 받았다 하더라도 접근 불가능. ★
 */
//---------------------------------------------------------------------------------------------
package oop01;

class Person2 {
	// Field(멤버필드, 멤버변수)
	int gender;
	int power;

	// Constructor
	Person2(){
		this.gender = 1; // 1: 남성, 2:여성
		this.power = 100; // 기본파워
	}
	
	// Method
	void walk() {
		System.out.println("걸어가고 있어요~");
	}
	
}

class Hero extends Person2 {
	// Field
	String name;
	int age;
	
	// Constructor
	Hero() {}

	Hero(String name, int age) { // 오버로딩, 인자값이 다른 여러개의 생성자을 만듬
		// 부모클래스의 생성자를 먼저 호출
		// super();  생략가능
		this.name = name;
		this.age = age;
	}
	
	// Method
	void walk() {   // 오버라이딩, 부모클래스에 있는 메소드를 가져와 재정의하여 사용
		System.out.println("2배로 빨리 걸어가고 있어요~");
	}
	void eat() {   // 오버라이딩, 부모클래스에 있는 메소드를 가져와 재정의하여 사용
		System.out.println("밥먹고 있어요~");
	}
	void displayPerson() {   // 오버라이딩, 부모클래스에 있는 메소드를 가져와 재정의하여 사용
	System.out.println("이름 : " + name + ", 나이 : " + age + ", 성별 : " + gender + ", 파워 : " + power);
	}
}

class Villain extends Person2 {
	
}

public class Practice_Inheritance01 {

	public static void main(String[] args) {
		
		// 1. 객체생성
		Person2 p1 = new Person2();
		
	//  p1.eat();  // eat은 Hero에 있기 때문에 사용불가. 상위클래스는 하위클래스의 메소드 사용불가.
		p1.walk();
		
		// 2. 상속을 통한 슈퍼맨 객체 생성
		Hero h1 = new Hero("슈퍼맨", 20);

		System.out.println(h1.name);
		System.out.println(h1.age);
		h1.displayPerson();
		
		if(h1.gender==1) {
			System.out.println("남자");  // 부모 클래스 변수
		}else
			System.out.println("여자");
		System.out.println("파워 : " + h1.power);  // 부모 클래스 변수
		System.out.println("------------------------------------");
		h1.walk();  // 상속, 재정의 했기때문에 가능 // 메서드 오버라이딩
		
		// 3. 원더우면 객체 생성
		
		Hero h2 = new Hero("원더우면", 30);
		h2.displayPerson();
		
		h2.gender = 2;
		h2.power = 300;
		h2.displayPerson();  // 성별 : 2, 파워 : 300 으로 출력
		h2.walk();
		
		
		
		
	}

}



