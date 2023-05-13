package ex01;

/* 만들기
1  2  3  4  5 
6  7  8  9 10 
11 12 13 14 15 
16 17 18 19 20 
21 22 23 24 25 
*/

public class Practice01 {

	public static void main(String[] args) {
		
		 

		int[][] num = new int[5][5];
		int count = 0;
		
				
		for(int i=0; i<num.length; i++)  
			for(int j=0; j<num[i].length; j++)
				num[i][j] = ++count;
		
		for(int i=0; i<num.length; i++) {    // 대괄호 잊지말기 ★★★
			for(int j=0; j<num[i].length; j++)
				System.out.printf("%2d ", num[i][j]);  // %숫자d 는 자리맞춤을 위해 씀
			System.out.println();
		}		
		
		
	}

}
