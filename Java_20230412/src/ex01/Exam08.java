package ex01;

import java.util.Arrays;

/*
 * 로또 프로그램 만들기.
 */
public class Exam08 {

	public static void main(String[] args) {
		
		int [] lotto = new int[6]; // 6개의 방
		
		//랜덤번호 생성
		for(int i=0; i<lotto.length; i++) { // 1부터 lotto.length의 값까지
			lotto[i] = (int)(Math.random()*45)+1; // 1~45 까지의 숫자
		
		// 중복번호 제거	
			for(int j=0; j<i; j++){
				  if(lotto[i] == lotto[j]){
				  i--;
				  break;
				  }
			}

		}
		
		// 오름차순 정렬
		for(int i=0; i<lotto.length; i++) {
			for (int j = i+1; j<lotto.length; j++) {
				if(lotto[i]>lotto[j]) {
					int tmp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = tmp;
				}
			}
		}
		
		// 랜덤번호 출력
		System.out.println("이번주 로또 번호는 : " + Arrays.toString(lotto)); // 괄호안에 값 나오게 하는 방법

			
	}

}
