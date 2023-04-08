package ex01;

import java.util.Scanner;

/*
 * 숫자 하나 입력 받아서 짝수인지 홀수인지 출력
 */
public class Exam04 {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요>>");
		int num = sc.nextInt();

//		if (num % 2 == 0)
//			System.out.println("짝수");
//		else
//			System.out.println("홀수");

		
//		if (num % 2 == 1)
//			System.out.println("홀수");
//		else
//			System.out.println("짝수");
		
		
		if (num % 2 != 0)
			System.out.println("홀수");
		else
			System.out.println("짝수");
		

		System.out.println("프로그램 종료");

	}

}
