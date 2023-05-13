package ex06;

public class Car {
	private Tire tire = new Tire();
	
	
	//                  익명자식객체 -> 부모클래스를 상속받아 아래같이 상속됨.
	private Tire tire2 = new Tire(){   //일회용
		public void roll() {
			System.out.println("익명 자식 Tire 객체1이 굴러감");
		}
//		public void test() {
//			System.out.println("익명 자식 Test");  // 불가능--> Tire 에서 재정의 하지않았으므로 접근불가
//		}
	};
	
	
	
	public void run1() {
		tire.roll(); //2
		tire2.roll();
	}
	
	
	public void run2() {
		Tire tire = new Tire() {
			@Override
			public void roll() {
				System.out.println("익명 자식 객체2가 굴러감");
			}
		};
		tire.roll();
	}
	
	
	public void run3(Tire tire) { tire.roll(); }
	
}
