package ex01;

//합수 
/*
 * 1. 더하기 : 반환타입 O, 매개변수(2개)
 * 2. 실수값을 전달하면 실수값을 정수로 변환해서 돌려주는 함수작성.
 */
public class FunctionExam01 {

	public static void main(String[] args) {
		    // void: 반환타입, main: 함수명, (): 매개변수 타입 {}: 함수가 수행하는 문장
		// ex: String main(int num) = 정수를 입력받아 문자열로 출력해라
        //        ↑ 이렇게 쓰면 return "문자열"; 을 써줘야 함.
		
 /*
//1.		
		System.out.println("프로그램 시작");
			
		int num = add(10,20);
		 //변수
		System.out.println("프로그램 끝" + ", " + num);
			
			}	
			
			
			
		static int add(int n1, int n2) {
			// (int-반환타입,함수) 없으면 void
			System.out.println("add함수 시작....");
			int result = n1 + n2;  // result 30=10+20
			return result;  // 30은 위(17줄)로 올라가서 변수가 받아준다.
		}
*/
		
//-------------------------------------------------------------	
	
		
//2.		
		System.out.println("프로그램 시작");
		
		int number = convertInt(10.2);
		                      //인자 값
		System.out.println("프로그램 끝" + ", " + number);
		
		}

	
	
		static int convertInt(double f) {  // 실수를 입력해서 정수로 출력
		       //함수명(변수이름처럼 변경가능)
			int result = (int)f;
			return result;
	}
	
	
		
	
}
