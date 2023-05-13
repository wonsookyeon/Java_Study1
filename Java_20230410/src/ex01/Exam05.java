package ex01;


// 1~ 10 합 구하기
 
public class Exam05 {

	public static void main(String[] args) {

		int sum=0;
		int i=1;
		
		for(;i<=10;) { //초기화, 증감식 생략가능
			sum +=i;
			i++;
		
/*			// 무제한반복 후 합이 1000000 일때 멈추고 출력
 * 			for( ; ; ) {
				if(sum<=1000000) break;
				sum+=i
			}
*/			
		}
		System.out.println(sum);
	}

}
