package ex01;


// 1~10 까지의 합
public class Exam01 {

	public static void main(String[] args) {

		int total = 0;
		int num = 10;
		
		for(int i=1; i<=10; i++)
			total +=i;
		
		System.out.println("합은 : " + total);
			
			
			
/*		
//                1		2     4
		for(int i=1; i<=10; i++)
			total += i;
//                   3   순서대로 계산, 2-3-4
		System.out.println("1~" + num + "까지 합 : " + total);
*/		
	}

}
