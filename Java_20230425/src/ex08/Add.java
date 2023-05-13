package ex08;

// 구현클래스(인터페이스(Calculable)를 구현)
public class Add implements Calculable{

	@Override
	public void calculable(int x, int y) {
		System.out.println("x+y : " + (x+y));
	}

}

class Sub implements Calculable{

	@Override
	public void calculable(int x, int y) {
		System.out.println("x-y : " + (x-y));
		
	}
	
}

