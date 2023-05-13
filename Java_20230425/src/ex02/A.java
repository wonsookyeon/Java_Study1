package ex02;

public class A {
	
	// 중첩클래스
	class B{
		int field = 1;  // 멤버변수, 인스턴스변수 // private 쓰면 접근불가
		void test() {} // 멤버메서드, 인스턴스메서드
		
		// java 17버전부터 허용
		//static int field2 = 1;  // 정적변수, 정적클래스변수, 스테틱변수
		//static void test() {} // 정적메서드
		
		B(){
			System.out.println("B객체 생성");
		}
	}
	
	class C {
		C(){
			System.out.println("C객체 생성");
		}
	}
	B field = new B();
	C field2 = new C();
	
	A(){
		System.out.println("A객체 생성");
		B b = new B();
		
	}
	
	void method() {
		B b = new B();
		
	}

}
