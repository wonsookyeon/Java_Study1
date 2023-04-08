package ex01;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		int age = 0; // 정수형 선언함... age 변수에는 ~-21억부터 +21억 저장 할 수 있다.
		
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		
		System.out.println("나이 : " + age);
		System.out.println("프로그램 종료!!"); 

	}

} 
