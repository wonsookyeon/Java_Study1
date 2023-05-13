package ex02;

public class AExam {

	public static void main(String[] args) {
		
		A a = new A();
		System.out.println("----------------");
		
		A.B b = a.new B();
		b.test();
		b.field=10;

	}

}
