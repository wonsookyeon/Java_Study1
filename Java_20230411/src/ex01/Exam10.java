package ex01;

/*
 * break, continue
 */
public class Exam10 {

	public static void main(String[] args) {
		
/*
		for(int i=1; i<=10; i++) {
			if(i%2==0) continue; // 2로 나눴을때 나머지가 0이면 출력되지않고 진행
				System.out.println(i);
		}
*/
		for(int i=1; i<=10; i++) {
			if(i%2==1)  // 2로 나눴을때 나머지가 1이면 출력
				System.out.println(i);
		}
		
		System.out.println("프로그램 종료");
	}

}
