package ex01;

//합수 
/*
 *  함수를 호출하면서 인자값 하나 전달(정수)하면 함수는 1부터 전달한 인자값까지 더해서
 *  더한 결과값을 호출함수에게 반환해서 홀수,짝수인지 출력
 */
public class FunctionExam06 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		
		int total = sumFunction(10);     //  total이라는 변수이름으로 return한 값을 받아줌.
										//(int num) 으로 올라오기때문에 ()에 정수지정.
		
		if(total%2 == 0)  // total을 2로 나눴을때 나머지가 0인 값 : 짝수
			System.out.println("짝수 " + total);
		else                                    // if 값이 아니면 : 홀수
			System.out.println("홀수 " + total);
				
		
		System.out.println("Total : " + total);
		
		
		System.out.println("프로그램 끝");
	}

		static int sumFunction(int num) {  // 1. 숫자하나(int num)를 받아서
			int sum = 0; // 합의 초기화, int 지정
			
			for(int i=1; i<=num; i++) // 2. i=1부터 숫자까지  
				sum +=i;   // 3. 더해간다.
			
			return sum;  // 4. 더한 값을 return해서 위(14줄)로 올려줌↑
			
		}
		
}







