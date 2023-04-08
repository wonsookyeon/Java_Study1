package ch2;

public class VarEx5 {

	public static void main(String[] args) {

		// 정수 + 정수 => 정수
		// 정수 + 실수 => 실수
		
		// 문자열 + 정수 => 문자열
		// 문자열 + 실수 => 문자열
		
		int num = 10;
		double d = 10.5;
		String s = "eng";
		double dd = num+d;
		
		System.out.println(num+d);
		System.out.println(s+d); // "eng" + "10.5" = eng10.5
		System.out.println(s+d+num); // "eng" + "10.5" = eng10.5 + "10" => eng10.510
		System.out.println(s+(d+num)); // 10.5+10 => "20.5" + "eng" => 20.5eng
		
		
		System.out.println(" " + 7+7); // 문자가 먼저나오면 문자+"77"
		System.out.println(7+7+" "); // 숫자가 먼저나오면 숫자계산 먼저 + 문자
		
		
		System.out.println("aaaaa");
		System.out.println("bbbbb");
		System.out.println("-------------");
		System.out.print("aaaaa ");
		System.out.print("bbbbb\n");   // \n : 줄바꿈
		System.out.println("-------------");
		
		int n = 15;
		System.out.printf("A : %d B: %d C: %d\n" ,10,20,30 );
		System.out.printf("%o, %d, %x, %X\n", n, n, n, n );  // format : 형식 \n:줄바꿈
		//                  8  10  16진법(대소문자)
		double d2 = 10.52456;
		System.out.println(d2);
		System.out.printf("%.2f", d2);
		System.out.println("-------------");
		
		int finger = 10;
		System.out.printf("finger : %d\n", finger);
		System.out.printf("finger : [%5d]\n", finger);  // 5칸 공백만들고 우측정렬
		System.out.printf("finger : [%-5d]\n", finger);  // 5칸 공백만들고 좌측정렬
		
		
		
	}

}
