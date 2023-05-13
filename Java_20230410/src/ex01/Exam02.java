package ex01;


//1~100 홀수 갯수
public class Exam02 {

	public static void main(String[] args) {

		int count = 0;
		
		for(int i=1; i<=100; i++) {
			if(i%2==1)
				count++;
		}
		System.out.println("홀수갯수는 : " + count);
		
		
/*		int count = 0;

		for (int i = 1; i <= 100; i++) { // 첫번째 방법 if문 쓰기
			if (i % 2 == 1)
//				System.out.println(i);
				count++;
		}
		System.out.println("홀수의 갯수는 : " + count);
		
// --------------------------------------------------------------------------	

		count = 0; //위에 주석처리 안해줬기때문에 count 초기화
		
		for (int i = 1; i <= 100; i = i + 2) // 두번째 방법 i=i+2 또는 i +=2 쓰기
			count++;

		System.out.println("홀수의 갯수는 : " + count);
	*/	
		
	}

}
