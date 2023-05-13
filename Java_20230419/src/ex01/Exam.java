package ex01;


class A {
	int a;
	int c = 100;
	A(){}
	A(int a, int c) {
		this.a = a;
		this.c = c;
	}

	void func() {
		System.out.println("func()");
	}
}

class B extends A {
	int b;
	int c = 200;

	B() {
		super(1, 2); // 아무것도없으면 상위클래스로 올라가서 실행 후 다시 돌아와서 실행
	}

	B(int a, int b) {
		super(a, b); // 아무것도없으면 상위클래스로 올라가서 실행 후 다시 돌아와서 실행
	}

	void func2() {
		System.out.println("func()");
	}
}

class C extends A {
	int k;

	void func3() {
		System.out.println("func3()");
	}
	
}

class D extends B{   // 상위클래스인 B도 쓸 수 있고 B의 상위클래스인 A도 쓸 수 있다. A의 하위클래스인 C 는 쓸 수 없음.
	int d;
	void func4() {
		System.out.println("func4()");
	}
	D(){
		super();   // 아무것도없으면 상위클래스로 올라가서 실행 후 다시 돌아와서 실행
	}
}

public class Exam {

	public static void main(String[] args) {
		
		B b = new B(1,2);
		b.a = 10;
		b.b = 20;
		b.func();
		b.func2();
		System.out.println(b.c);
		
		System.out.println("---------------------");
		
		A a = new A();
		a.a = 1;
		a.c = 2;
		a.func();
		System.out.println("-------------------------");
		
//		C c = new C();
		

	}

}
