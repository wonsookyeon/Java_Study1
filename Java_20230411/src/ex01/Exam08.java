package ex01;

/* int 타입의 변수 num이 있을 때 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라.
 * 만일 문자열이 "12345"라면 '1+2+3+4+5' 결과인 15를 출력하여야 한다.
 * [주의] 문자열로 변환하지 말고 숫자로만 처리해야 한다.
 */
public class Exam08 {

	public static void main(String[] args) {

		int num = 12345;
		int sum = 0;
		
		while(num>0){
			sum+= num%10;	// 12345를 10으로 나누면 1234.5 이므로 나머지는 5	
			num/=10;	// num=12345 이므로 10으로 나누면 1234.5 에서 몫인 1234 만 남게됨
								// 반복하면 이렇게 됨↓
/*			sum+= num%10;	//4
			num/=10;	//123
			sum+= num%10;	//3	
			num/=10;	//12
			sum+= num%10;	//3	
			num/=10;	//1
			sum+= num%10;	//1	
			num/=10;	//1
*/
		}	
			
		System.out.println("sum = " + sum);
		
	}

}
