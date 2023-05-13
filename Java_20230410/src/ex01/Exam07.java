package ex01;

/*★★★★★
 * 1+(-2) +3 + (-4) + .... 이런식으로 더해나갈때, 몇까지 더해야 총합이 100이상 될까?
 * 이 때 i값하고 총합을 출력
 */
public class Exam07 {

	public static void main(String[] args) {
		
		int sum = 0;
		int i = 0;
		
		for(i=0; true; i++) {
			if(i%2==1)
				sum +=i;
			else
				sum -=i;
		
			if (sum>=100) break;
		}

		System.out.println("i : " + i + ", sum : " + sum);
		
		
/*		
		int sum = 0;
		int i = 0;

		for (i = 0;; i++) { // i=0; ; i++ 둘다 생략해도 ok, ( ; true ; ) 이렇게 써도 됨.

			if (i % 2 == 1) // 홀수면 +1
				sum += i; // 2일때 0==+1
			else // 짝수면
				sum -= i; // 1일때 0==-1

			if (sum >= 100)
				break;
		}

		System.out.println("i : " + i + ", sum : " + sum);
*/					
	}

}
