package ex01;

//합수 
/*
 *  더하기 : 반환타입o, 매개변수x
 *  호출함수에게 실수값을 전달하면 호출함수에서 정수로 변환해서 출력
 */
public class FunctionExam04 {

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
/*		
		int num = convertInt();  // return 받은 변수를 num에 입력
		System.out.println(num);
		//System.out.println(convertInt());  // num에 입력안하고 이렇게도 가능
		}
*/	
	
		
		
		double df = convertInt();
		System.out.println((int)df);
		
		System.out.println("프로그램 끝");
	}

		static double convertInt() {
			return 10.2;
		}
	
/*
		static int convertInt() {  // 매개변수가 없으므로 ()
			double i = 10.5;  // 변수를 만들어줘서 식을 입력
			return (int)i;  // 입력받은 변수 i는 실수이므로 (int)를 붙여서 정수로 형변환 후 return ↑↑
			
		}
*/
		
}
