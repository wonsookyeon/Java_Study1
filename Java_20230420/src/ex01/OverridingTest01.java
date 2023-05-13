package ex01;


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

public class OverridingTest01 {

	public static void main(String[] args) {
		
		AA aa = new BB();
		BB bb = (BB)aa;
		aa.funcAA();
		
		AA a = new AA();  // 상위클래스가 하위클래스 참조가능
		//	BB b = new AA(); 하위클래스가 상위클래스 참조 불가능
		BB b = new BB();

		System.out.println(aa.toString()); //object to String() 출력: 오버라이딩 하기 전
		
//		object o = new BB();
	//	System.out.println(o.toString());
		
		//대전체 : 하위클래스가 상위클래스 참조불가
		AA aaa = new BB();   // aaa 가 BB를 참조
		BB bbb = (BB)aaa;   // bbb에 aaa주소값을 복사하므로 aaa와 같이 BB를 참조
		

	}

}
