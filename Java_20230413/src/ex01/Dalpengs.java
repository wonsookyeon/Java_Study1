package ex01;

/* 
 *   1  2  3  4 5
 *  16 17 18 19 6
 *  15 24 25 20 7
 *  14 23 22 21 8
 *  13 12 11 10 9  (숫자달팽이) 만들기
 */
public class Dalpengs {

	public static void main(String[] args) {

		
		int[][]arr = new int[5][5]; 
		int count = 1;
		int row = 0;
		int col= -1;
		
		int size = 5;  //열의 사이즈 5
		
		while(size>0) {
			
			for (int i =0; i<size; i++) { // 열의 사이즈 5까지
				col++;  // col +1  = 0이 되어 [0][0] 을 만들어 줘야해서 col=-1로 시작함.
				arr[row][col] = count++;
			}
			size--;  // 열의 사이즈 4
			
			
			if(size==0) 
				break;
			
			
			for (int i=0; i<size; i++) {  //밑으로 
				row++;
				arr[row][col] = count++;
			}  
			
			
			for (int i=0; i<size; i++) {
				col--;  
				arr[row][col]=count++;
			} 
			size--; // 열의 사이즈 3
			
			
			if(size==0)
				break;
			
			
			for (int i=0; i<size; i++) {
				row--;
				arr[row][col] = count++;
			}
		}
		
		for (int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		/*		
		int[][] num = new int[5][5];
		int count=1;
		
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				count += 1;{
					//if 
				}
				System.out.print(num[i][j]);
			}
			System.out.println();
		}
*/
	}

}
