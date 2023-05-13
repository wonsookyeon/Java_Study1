package ex01;

/*
 * break, continue
 */
public class Exam11 {

	public static void main(String[] args) {
		
		
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
	
						
//				if(i==j) continue; // i랑 j가 같을때 출력안하고 패스
			
				System.out.println(i + "x" + j + "=" + i*j);
				if(i==j) break;
			}
		}
		
		System.out.println("프로그램 종료");
	}

}
