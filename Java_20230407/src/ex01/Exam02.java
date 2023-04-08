package ex01;

import java.util.Scanner;

// 성적을 입력받아서 학점을 구하는 프로그램 작성
// 90이상 A, 80이상 B, 70이상 C, 60이상 D, 나머지 F
public class Exam02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("성적입력>");
		int number = sc.nextInt();

		if (number >= 90 && number <= 100)
			System.out.println("A학점");
		else if (number >= 80 && number < 90)
//		else if (number >= 80)  //100이상의 숫자를 입력하면 B학점이 나올 수 있다.
			System.out.println("B학점");
		else if (number >= 70 && number < 80)
			System.out.println("C학점");
		else if (number >= 60 && number < 70)
			System.out.println("D학점");
		else if (number<60)
			System.out.println("F학점");
		else
			System.out.println("정신차리자..");

		System.out.println("프로그램 종료");

	}

}
