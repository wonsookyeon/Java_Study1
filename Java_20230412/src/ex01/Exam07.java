package ex01;

/*
 * 로또 프로그램 만들기.
 */
public class Exam07 {

	public static void main(String[] args) {
		
		int [] lotto = new int[45]; // 45개의 방
		
		for(int i=0; i<lotto.length; i++) 
			lotto[i] = i+1;        // +1해줘서 i는 0~44 가 아닌 1~45로 만들어줌
//		for(int i=0; i<lotto.length; i++) // 1부터 45까지의 숫자가 들어가있음.

		
		
		for(int i=0; i<lotto.length; i++) { // 1부터 lotto.length의 값까지
			int num = (int)(Math.random()*45)+1; // 0~44 까지의 숫자
			
			int tmp = lotto[i];
			lotto[i] = lotto[num];
			lotto[num] = tmp;	  
		}
		
		
		System.out.println("이번주 로또 번호는 : ");
		for(int i=0; i<6; i++)
			System.out.print(lotto[i] + ",");
		
	}

}
