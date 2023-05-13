package ex05;

//람다식

interface MyFunction{
	int max(int a, int b);  //추상메서드
}


public class LambdaEx01 {

	public static void main(String[] args) {
		
		
//		MyFunction m = new MyFunction() { // 익명객체  Ctrl+space하면 ↓ 재정의 한번에 다 만들어줌
//			
//			@Override
//			public int max(int a, int b) {
//				return a>b? a: b;
//			}
//		};
		
		// 람다식
		MyFunction m = (a, b) ->  a>b? a: b;  //구현객체, max라는 메서드를 구현한 객체만 올 수 있음
							//-> 람다식 표시
		
		System.out.println("max : " + m.max(10, 20));
		
		

		

	}

}
