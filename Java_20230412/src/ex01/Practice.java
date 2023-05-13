package ex01;

//import java.util.Arrays;

/*
 * 1. 배열 10개 생성 후 랜덤으로 1~100 사이 값을 넣는다.
 * 2. 총점과 평균을 구한다.
 * 3. 최대값과, 최소값을 구한다.
 * 4. 오름차순으로 정렬을 한다.
 */
public class Practice {

	public static void main(String[] args) {
		
		int [] num = new int[10];   // 배열 10개 생성
		
		for(int i=0; i<num.length; i++)
			num[i]=(int)(Math.random()*100)+1;  // 랜덤범위 1~100 지정해서 num[i] 값에 입력
		
		for(int i=0; i<num.length; i++)  // int i;
			
			System.out.print(num[i] + ",");  // 랜덤으로 배열 10개에 입력된 숫자들 출력
		
		System.out.println();  // 줄바꿈
		
//-------------------------------------------------------------------------------------		
		
		int sum=0;
		int max=num[0];
		int min=num[0];
		// int max,min;
		// max=min=num[0];  // 이렇게도 쓸 수 있음.  int max,min=num[0]; 라고 쓰면 min에만 입력됨.
		double average=0;

		for (int i = 1; i < num.length; i++) {

			sum += num[i]; // 입력받은 숫자들의 총 합계

			if (max < num[i])
				max = num[i]; // 입력받은 숫자들의 최대값

			if (min > num[i])
				min = num[i]; // 입력받은 숫자들의 최소값
		}
		
		average = sum / num.length; // 입력받은 숫자들의 평균
		
		System.out.println("총점 : " + sum); // 총점 출력
		System.out.println("평균 : " + average); // 평균 출력
		System.out.println("최대값 : " + max); // 최대값 출력
		System.out.println("최소값 : " + min); // 최소값 출력
		
//-------------------------------------------------------------------------------------		
		
		for (int i = 0; i < num.length; i++)
			for (int j = i + 1; j < num.length; j++) {  // 입력받은 숫자들을 차례로 비교하여
				
				if (num[i] > num[j]) {
					int tmp = num[i];
					num[i] = num[j];
					num[j] = tmp;            // 오름차순으로 자리바꿔주기
				}
			}
		
		for(int i=0; i<num.length; i++)  // int i; 초기화
		
			System.out.print(num[i]+","); // 오름차순으로 정렬해준 숫자들 출력
		 //System.out.print(Arrays.toString(num));

	}

}
