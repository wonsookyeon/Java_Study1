package ex04;

interface MyFunction{
	int max(int a, int b);  //추상메서드
}

//class MyMax implements MyFunction{  //interface 구현
//
//	@Override
//	public int max(int a, int b) {
//		return a>b? a:b;
//	}
//	
//}

public class LambdaEx01 {

	public static void main(String[] args) {
		
		MyFunction m = new MyFunction() { // 익명객체  Ctrl+space하면 ↓ 재정의 한번에 다 만들어줌
			
			@Override
			public int max(int a, int b) {
				return a>b? a: b;
			}
		};
		
		System.out.println("max : " + m.max(10, 20));

	}

}
