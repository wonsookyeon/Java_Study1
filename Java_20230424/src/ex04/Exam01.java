package ex04;

import ex03.Exam04;

public class Exam01 {

	public static void main(String[] args) {
		Exam04 ex = new Exam04();
		// ctrl+shift+o --> import
		// public 이 붙은 클래스는 다른 패키지에서도 사용가능
		
		//Study st = new Study();
		// public 이 붙지않은 다른 패키지의 default 클래스는 다른 패키지에서 사용불가

		ex.sun(); // public
	}

}
