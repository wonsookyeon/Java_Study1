package ex01;

public class Exam02 {

	public static void main(String[] args) {
		// 형변환
		// byte<short<int<long  <float<double
		// ==> 자동형변환
		// 연산이나 대입할 때 타입이 일치하지 않으면 실행이 안된다.
		// 따라서 먼저 타입을 일치 시킨다. 타입을 일치시킬 때 형변환이 발생한다.
		double d = 85.4;
		int score = 10;
		
		d = score;
	//	d = (double)score;
		System.out.println(d);
		
		d = 85.4;
		
		score = (int)d;
		System.out.println(score);
		
		int sum = 10; // int의 최대값 = 2147483647
		long longsum = 3000000000l;  // long타입이라는것을 알려주기위해 l 표시
		
		sum = (int)longsum;
		System.out.println(sum);
		
//		longsum = (long)sum;	
//		System.out.println(longsum);
		
		short sh = 32767;
		int num = 10000;
		sh = (short)num;
		
		System.out.println(sh);
		System.out.println((double)5/2);  //  /(나누기)는 몫이 나오고 %는 나머지가 나옴
		
		int a = 5, b = 2;
		int tmp = a & b;
		System.out.println(5 & 2); // 0101(5) & 0010(2) = 0000(0) 같은자리에 둘다 1이면 1, 아니면 0
		System.out.println(5 | 2); // 0101(5) | 0010(2) = 0111(7) 같은자리에 하나만 1이어도 1, 아니면 0
		
		
	}

}
