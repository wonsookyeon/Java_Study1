package ex01;


// 1~ 10 합 구하기
 
public class Exam05_01 {

	public static void main(String[] args) {

		int sum=0;
		int i=1;
		
/*		for(;i<=10;) { //초기화, 증감식 생략가능
			sum +=i;
			i++;}
*/		
			// 무제한반복 후 합이 1000000 일때 멈추고 출력
			for (;;) {
				if (sum <= 100000)
					sum+=i;
					break;
			}
		
		System.out.println(sum);
	}

}
