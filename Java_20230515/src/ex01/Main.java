package ex01;

public class Main {
	static void test(A test) {
		
		if( test instanceof D) {
			D d = (D)test;
//			D d = new D();
			d.funcD();
		}else if (test instanceof E) {
			E e = (E)test;
//			E e = new E();
			e.funcE();
		}
		
	}

	public static void main(String[] args) {
		
		A a = new D(); // new A(); 빼고 다 가능 (A는 interface 이므로 불가)
		B b = new D();  // or new D() => 객체 자기자신(B)과 자기자신을 상속한 것들만 가능
		C c = new C(); // or new E() => 객체 자기자신(C)과 자기자신을 상속한 것들만 가능
		
		D d = (D) b; // new B(); 는 불가 => 하위클래스는 상위클래스를 참조할 수 없다.

		
		test(new B());  // B~E //new A(); 빼고 다 가능 (A는 interface 이므로 불가)
		test(new C());
		test(new D());
		test(new E());
	}

}
