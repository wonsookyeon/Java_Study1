package practice;
// 숫자로 이루어진 문자열의 각 자리의 합을 더한 결과 출력

public class Exam4_9 {

	public static void main(String[] args) {
		
		String str = "12345";
		int sum = 0;
		
		int num = Integer.parseInt(str);
		
		while(num !=0) {
			sum += num%10;
			num = num/10;
		}
		System.out.println("sum = " + sum);

		// 2.
//		for(int i=0; i<str.length(); i++) {
//			int num = str.charAt(i)-48;
//			sum += num;
//		
//		}
//		
//		System.out.println("sum: " + sum);
	}
}


