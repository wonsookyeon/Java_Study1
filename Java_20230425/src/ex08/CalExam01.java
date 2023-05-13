package ex08;

//메인클래스
public class CalExam01 {

	public static void main(String[] args) {
		
		//구현클래스를 따로 빼서 쓰지않고 여기서 한번에 재정의 함
		Calculable cal = new Calculable() {
			@Override
			public void calculable(int x, int y) {
				System.out.println("x+y : " + (x+y));
			}
		};
		cal.calculable(10, 5);
		
		
		
		cal = new Calculable() {
			@Override
			public void calculable(int x, int y) {
				System.out.println("x-y : " + (x-y));				
			}
		};
		cal.calculable(5, 7);
		
		
		System.out.println("---------------------------");
		
		
		
		
		// 구현클래스 Add.java 에서 Add 클래스 와 함께 씀
		Calculable cal2 = new Add();
		cal2.calculable(10, 5);
		
		// 구현클래스 Add.java 에서 Sub 클래스와 함께 씀
		cal2 = new Sub();
		cal2.calculable(5, 2);
		
		
		
		System.out.println("---------------------------");
		
		
		
		// -> 람다식   // interface가 존재, 추상메서드가 하나일 때
		cal = (int x, int y) -> {
			System.out.println("x-y : " + (x - y));
		};
		cal.calculable(15, 7);
		
		
		// ↓ 더 줄이기 (int 빼기)
		cal = (x, y) -> System.out.println("x-y : " + (x - y));
		cal.calculable(17, 7);
		
		cal = (x, y) -> System.out.println("x*y : " + (x*y));
		cal.calculable(5, 5);
		
	}

}
