package ex01;

import java.util.Scanner;


//문제2. 정수 한 개를 입력받아서, 그 수가 3의 배수인지 판단해보자.
public class Q02 {

	public static void main(String[] args) {

		System.out.println("숫자를 입력하세요.>>");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if(num % 3 ==0)
			System.out.println("3의 배수");
		else
			System.out.println("3의 배수 아니다.");
		
	}

}
