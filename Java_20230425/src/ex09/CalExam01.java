package ex09;

//메인클래스
public class CalExam01 {

	public static void main(String[] args) {
		
		
		// 인터페이스 구현해서 Test 클래스와 함께 사용
		Calculable cal2 = new Test();
		System.out.println(cal2.calculate(4));
		
		
		
		
		// 익명구현객체
		Calculable cal3 = new Calculable() {
			
			@Override
			public int calculate(int x) {
				return x*x*x;
			}
		};
		cal3.calculate(2);
		
		
		
		
		// 람다식 ->
//		Calculable cal = x -> System.out.println(x*3);
//		cal.calculate(9);
//		cal.calculate(3);
		
		
		
//		Calculable cal = x -> {
//			int result = x*x*x;
//			return result;
//		};
		
		// ↓↓ 더 짧게
		Calculable cal = x -> x*x*x;		
		System.out.println(cal.calculate(3));
		System.out.println(cal.calculate(5));
		
	
	}

}
