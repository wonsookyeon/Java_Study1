package ex01;

/*
     +
    ++
   +++
  ++++
 +++++ 출력
 행 : i 5
 열 : 
 */

public class Exam04 {

	public static void main(String[] args) {
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(j<4-i)
					System.out.print(" ");
				else System.out.print("+");
			}
			System.out.println();
		}
		
		
/*		
		
		for (int i=0; i<5; i++) {
			for (int j=0; j<4-i; j++) {
				System.out.print(" ");
			}
		for(int j=0; j<5-(4-i); j++) {
			System.out.print("+");
		}
		System.out.println();
		}
		
		
/*
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j > 0; j--) {
				if (j < i + 1)
					System.out.print("+");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
*/		
		
	}

}
