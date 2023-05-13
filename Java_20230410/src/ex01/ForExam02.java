package ex01;


/*
 * 3이상 4462 이하에서 짝수인 정수의 합
 */
public class ForExam02 {

	public static void main(String[] args) {
		
		
		int sum =0;
		
		for(int i=1; i<5000; i++) {
			if(3<=i && i<=4462 && i%2==0)
				sum +=i;
		}
		
		System.out.println(sum);

	}

}
