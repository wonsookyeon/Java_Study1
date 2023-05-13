package ex01;

public class Exam05 {

	public static void main(String[] args) {
		
		
		
		int[][] num = new int[4][3];
		int count=0;
		
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				if(i==j) num[i][j]= ++count;  //행과 열이 같을 때 1씩 더해서 입력
				
			System.out.print(num[i][j] + ",");
			}
		System.out.println();}
		
/*
		int num[][] = {
				{1,0,0,0},
				{0,2,0,0},
				{0,0,3,0},
				{0,0,0,4}
		};
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++)
				System.out.print(num[i][j]);
			
			System.out.println();
		}
*/
	}

}
