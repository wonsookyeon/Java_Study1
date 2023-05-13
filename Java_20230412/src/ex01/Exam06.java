package ex01;

/*
 * 1. int 배열 10개 생성
 * 2. 랜덤함수 이용해서 10개 초기화
 * 3. 오름차순으로 정렬해서 출력
 */
public class Exam06 {

	public static void main(String[] args) {

		int num[] = new int[10]; // 10개 배열 생성

		for(int i=0; i<num.length; i++) // 생성한 배열 값 만큼의 수를
			num[i] = (int) (Math.random() * 100) + 1;  // 랜덤으로 입력해줌
			
				
		for(int i=0; i<num.length; i++)  // int i 초기화를 위해 써줌
				System.out.print(num[i] + ",");  // 랜덤으로 입력받은 수를 출력
			System.out.println();

//--------------------------- <랜덤으로 숫자 받아줌>
		// 오름차순으로 정렬
			System.out.println("오름차순 정렬 : ");
			
			for (int i = 0; i < num.length; i++) // i는 0번째 숫자 부터
				for (int j=i+1; j < num.length; j++) { // j는 i다음번째 부터 하나씩 넘어가며 비교
//				for(int j=0; j<num.length; j++) { // 변경하려면 아래 문장을 if (num[i] < num[j]) 으로 바꿔줘야 함. 좋은방법은 아님.
				
					if (num[i] > num[j]) { // 비교해서 i가 j보다 크면  ↓ 실행
				
						int tmp = num[i]; // tmp 에  i 입력 (change)
						num[i] = num[j]; // 숫자 i를 j에 입력  
						num[j] = tmp; // j에 tmp 입력
					}
				}
				
			for(int i=0;  i<num.length; i++) // 다시 반복해서 
				System.out.print(num[i] + ",");
			
		}

}
