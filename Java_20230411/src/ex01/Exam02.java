package ex01;

/*
 +++++
 +++++
 +++++ 출력
 행 : i 3
 열 : j 5
 */

public class Exam02 {

	public static void main(String[] args) {

		for(int i=0; i<3; i++) {
			for(int j=0; j<5; j++) 
				System.out.print("+");  // print를 써서 세로로 나열
			System.out.println();  // 한번 돌았을 때 println 을 써서 줄바꿈 시켜준다.
		}
	}

}
