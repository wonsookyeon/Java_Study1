package ex01;

/*
 * 1. int 배열 10개 생성
 * 2. 랜덤함수 이용해서 10개 초기화
 * 3. 최대값, 최소값 출력
 */
public class Exam04 {

	public static void main(String[] args) {
		
		int [] num = new int [10];  // 배열생성
		
		for(int i=0; i<num.length; i++) 
			num[i] = (int)(Math.random()*100)+1;
		
		for(int i=0; i<num.length; i++)
			
			System.out.print(num[i] + ",");
		System.out.println();  // 줄바꿈

//--------------------------- <랜덤으로 숫자 받아줌>
		
		int max = num[0];  // 배열의 첫번째 값으로 최대값을 초기화 한다.
		int min = num[0];  // 배열의 첫번째 값으로 최소값을 초기화 한다.
		
		for(int i=1; i<num.length; i++) {  // 배열의 두번째 요소부터 읽기위해 변수 i의 값을 1로 초기화
			if(num[i]>max)   // 크기비교 후 false 면 그 다음번째 요소와 비교
				max=num[i];  
			
			if(num[i]<min)
				min=num[i];
		}
		
			System.out.println("max = " + max);
			System.out.println("min = " + min);
		
		
		
			
		}

}
