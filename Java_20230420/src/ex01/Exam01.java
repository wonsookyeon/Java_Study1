package ex01;

//오버로딩: 함수명은 같고 매개변수 달라야하고 반환타입은 상관없음
//오버라이딩: 함수명, 매개변수, 반환타입 같고 안에 내용만 다름

class A{
	int a=10;
	void func() {
		System.out.println("A - a :"+ a);
	}
}

class B extends A{  
	int a=20;
	void func2() {
		System.out.println("B - a :" + a);
	}
	
}


public class Exam01 {

	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.a); // int a 충돌하면 자기자신먼저

	}

}
