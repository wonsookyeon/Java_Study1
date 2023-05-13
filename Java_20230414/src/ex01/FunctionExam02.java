package ex01;

//합수 
/*
 *  return 하는 값이 없을 때
 */
public class FunctionExam02 {

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		
		// 변수값은 여기서 정해준다.
		 convertInt(10.5);
		 add(10,20);  // 반환(return)하는 값이 없으면 이렇게 쓰면 됨.
		 
		System.out.println("프로그램 끝");
	}
		
		
		static void convertInt(double f) {   // 실수값을 입력하여 정수값으로 출력
			System.out.println((int)f);     // 출력할때 변수값을 정수값으로 바꿔준다
		}

	
	
		static void add(int num1, int num2) {  // 더하기 할 값을 변수이름으로 넣어주고
			System.out.println("더하기 : " + (num1+num2));  // 출력은 변수이름으로 출력 ↑↑
		
//		int result = num1 + num2;  
//		return result;              // 이게 없으므로 return 하는 값이 없음.
	}

		
	
}
