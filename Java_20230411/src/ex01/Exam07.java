package ex01;

/*숫자로 이루어진 문자열 srt이 있을 때 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라.
 * 만일 문자열이 "12345"라면 '1+2+3+4+5' 결과인 15를 출력이 되어야 한다.
 * [Hint] String chartAt(int i) 클래스를 사용

 */
public class Exam07 {

	public static void main(String[] args) {
		
		String str = "12345";
		int sum = 0;
				
		for (int i=0; i<str.length(); i++) {
			
			char tmp = str.charAt(i);
			int num = (tmp-'0');
			sum += num; //아스키코드표 0
			
//			sum += str.charAt(i)-'0'; // i='1'이면 sum값을 1을 만들어줘야해서 문자 '1'의 값인 49 -48 해줘야하므로 48인 문자 '0'을 빼줘야한다.
	//        1  =     '1'=49    - '0'=48
			
			
		}
		System.out.println("sum = " + sum);
	}

}
