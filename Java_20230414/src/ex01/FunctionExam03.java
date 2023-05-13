package ex01;

//합수 
/*
 *  더하기 : 반환타입o, 매개변수x
 */
public class FunctionExam03 {

	public static void main(String[] args) {
	
		System.out.println("프로그램 시작");
		
		int num = add();  // return 받은 변수를 num에 입력
		System.out.println(num);
				
		System.out.println("프로그램 끝");
	}
	
	
		static int add() {  // 매개변수가 없으므로 ()
			int i = 10+20;  // 변수를 만들어줘서 식을 입력
			return i;  // 입력받은 변수 i를 return ↑↑
			
		}
	
}
