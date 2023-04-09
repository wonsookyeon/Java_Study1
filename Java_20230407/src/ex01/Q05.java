package ex01;

import java.util.Scanner;

//문제5. 사용자로 부터 정수를 입력받아서 양수인지 음수인지 확인하는 프로그램 작성 ok
public class Q05 {

	public static void main(String[] args) {
	
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력>> ");
		
		int num = sc.nextInt();
		
		if (num>0)
			System.out.println("양수");
		else if (num<0)
			System.out.println("음수");
		else
			System.out.println("0인가보다");
		
		
		
		
		
		
		
/*		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요.>>");
		int num = sc.nextInt();
		
		if (num>=0)
			System.out.println("양수");
		else
			System.out.println("음수");
*/		
	
	}

}
