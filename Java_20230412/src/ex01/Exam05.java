package ex01;

/*
 * 1. int 배열 10개 생성
 * 2. 랜덤함수 이용해서 10개 초기화
 * 3. 최대값, 최소값 출력
 */
public class Exam05 {

	public static void main(String[] args) {

		int num[] = new int[10]; //10개의 배열 생성

		for (int i = 0; i < num.length; i++)   // 생성한 배열 값 만큼의 수를
			num[i] = (int) (Math.random() * 100) + 1; // 랜덤으로 입력해줌
		
		for(int i=0; i<num.length; i++) // int i 초기화를 위해 써줌
			System.out.print(num[i] + ",");  // 랜덤으로 입력받은 수를 출력
		System.out.println();

//--------------------------- <랜덤으로 숫자 받아줌>
		
		int max, min;
		max = num[0];
		min = num[0];

		for (int i = 0; i < num.length; i++) {
			if (max < num[i])
				max = num[i];

			if (min > num[i])
				min = num[i];
		}

		System.out.println("max = " + max);
		System.out.println("min = " + min);
		
			
		}

}
