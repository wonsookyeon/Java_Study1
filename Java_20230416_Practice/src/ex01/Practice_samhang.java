package ex01;

// 삼항 연산자
// 삼항 연산자를 이용하여 12시보다 작으면 오전, 크면 오후를 출력
public class Practice_samhang {

	public static void main(String[] args) {
		
		//1. 변수선언
		int hour = 18;
		
		//2. 삼항 연산자 테스트 --> 10보다 작거나 같으면 100을 곱하시오.
//		hour = hour<=10 ? hour*100:hour;
		int test = hour<=10 ? hour*100:hour;
		           // 조건문     A:B 맞으면 A, 아니면 B를 변수에 입력
		System.out.println("[2]"+test);
		
		//3. 삼항 연사자를 이용하여 12시보다 작으면 오전, 크면 오후 출력
		String ampm = hour<12 ? "오전" : "오후";  //결과값이 문자이므로 문자열로 입력받아줘야 한다.
//		String str1= "오전";
//		String str2= "오후";
//		String ampm = hour<12 ? str1 : str2;  //결과값이 문자이므로 문자열로 입력받아줘야 한다.
		System.out.println("[3]"+ampm);
		
		
		
	}

}
