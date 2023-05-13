package ex01;

/*
 * break, continue
 */
public class Exam09 {

	public static void main(String[] args) {
		
		int sum=0;
		int i=0;
/*		
		for(;;) {
			for(;;) {
				break;
			}
		}
		
*/
		while(true) {
			sum +=i; //sum=sum+i;
			i++;

			System.out.println("sum=" + sum);
			
			if(sum>1000000) break;
		}
		System.out.println("프로그램 종료");
		
	}

}
