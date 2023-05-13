package ex01;

//합수 
/*
 *  더하기 : 반환타입x, 매개변수x
 *  호출함수에게 실수값을 전달하면 호출함수에서 정수로 변환해서 출력
 */
public class FunctionExam05 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");

/*★★		int num = add();
		System.out.println(num);
*/
		add(); // 1. 더하기
		convertInt(); // 2. 실수값 전달 -> 정수로 변환해서 출력	
		
		System.out.println("프로그램 끝");
	}
	
		// 1. 더하기
		static void add() {
			int num = 10+20;
			System.out.println(num);
		}
	
	
/*★★		static int add() {
			return (20+20);
	}
*/	
		
		// 2. 실수값 전달 -> 정수로 변환해서 출력	
		
		static void convertInt() {
		double i = 10.5;
		System.out.println((int)i);
	}
	
		
}
