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

public class Exam03 {

	public static void main(String[] args) {
/*
		for(int i=0; i<5; i++) {  // i는 0,1,2,3,4 이므로
			for(int j=0; j<i+1; j++)  //  j는 j+1
				System.out.print("+");  // print를 써서 세로로 나열
			System.out.println();  // 한번 돌았을 때 println 을 써서 줄바꿈 시켜준다.
	*/		
			
			
			
			
			 for(int i=1; i<=5; i++) {  
			for(int j=1; j<=i; j++)    
				System.out.print("+");  
			System.out.println();
			 
		}
	}

}
