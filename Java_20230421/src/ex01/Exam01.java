package ex01;

class B {
	static void f1() { System.out.println( "f1()" );}
}

class K extends B {
	static void f2() { System.out.println( "f2()" );}
}

class C extends B {
	static void f3() { System.out.println( "f3()" );}
}

class E extends B {
	static void f4() { System.out.println( "f4()" );}
}


public class Exam01 {

	public static void main(String[] args) {
		
		func(new B());
		func(new K());
		func(new C());
		func(new E());
	}
	
	static void func(B b) {
		
		if  ( b instanceof K ) {    // b가 K객체를 참조하거나 K를 상속하고 있는 객체이면 true
			K kk = (K)b;  // (K)를 붙여줌으로서 K는 b를 참조할 수 있다.
			kk.f2();    // 8줄로 가서 출력
		}else if  ( b instanceof C ) {
			C cc = (C)b;
			cc.f3();
		}else if  ( b instanceof E ) {
			E ee = (E)b;
			ee.f4();
		}else if  ( b instanceof B ) 
			b.f1();
	}
}
			


