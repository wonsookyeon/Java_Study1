package ex01;

public class Exam04 {

	public static void main(String[] args) {
		
//		int[] num = new int[5];
		
		int[][] num = new int[4][3];  //[행][열]		

		num[2][1] = 100;  // 2행 1열에 100 입력

		int[][] num2 = {
				{1,2,3,3}, // 4  num2[0]
				{4,5,6,6,5}, // 5 num2[1]
				{7,8,9,9,4,5} // 6 num2[2]
				};
		
		for(int i=0; i<3; i++) {   // i 는 행
			for (int j=0; j<num2[i].length; j++) // j 는 열 //행의 길이가 다를때는 i의 길이로..
				System.out.print(num2[i][j] + ",");
			
			System.out.println();
		}
		
/*		for(int i=0; i<num.length; i++)
			for(int j=0; j=num[i].length; j++)
				num[i][j] = (int)(Math.random()*100)+1;
		
		for(int i=0; i<num.length; i++)
			for(int j=0; j=num[i].length; j++) // j 는 열 //행의 길이가 다를때는 i의 길이로..
				System.out.print(num[i][j] + ",");
							
		System.out.println();
						}
*/		
	}

}
