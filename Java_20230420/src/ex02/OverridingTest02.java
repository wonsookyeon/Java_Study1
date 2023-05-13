package ex02;


class AA {
	void funcAA() {
		System.out.println("A의 func");
	}

	public String tostring() {
		return "AA class";
	}
}

class BB extends AA {
	void funcBB() {
		System.out.println("B의 func2");
	}
	public String tostring() {
		return "BB class";
	}
}

class CC extends AA{
}

public class OverridingTest02 {
	
	static void action(AA a) { // a 에는 AA의 하위클래스인 BB와 CC를 참조할 수 있음.
		if (a instanceof AA) {
			AA aa = a;
		}else if ( a instanceof BB) { // a가 참조하고 있는 대상이 BB이면 true ↓실행
			BB bb = (BB)a;    // 그냥 a만쓰면 하위클래스가 상위클래스를 참조하게 되는것이므로 참조불가능이라 (BB)를 써주면 가능. (형변환)
		}else if ( a instanceof CC) {
			CC cc = (CC)a;
		}
	}

	public static void main(String[] args) {
		
		action(new AA()); //AA a = new AA();
		action(new BB()); //BB a = new BB();
		action(new CC()); //CC a = new CC();
		

	}

}
