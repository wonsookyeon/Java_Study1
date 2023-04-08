package ex01;

import java.util.Scanner;

// 성적 입력 받아서 70이상이면 합격했습니다 메세지 출력
public class Exam04 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int jumsu = sc.nextInt();
		
//조건문 ~ if
		if(jumsu >= 70)
			System.out.println("당신은 합격했습니다.");
			
		if(jumsu < 70)
			System.out.println("당신은 불합격 입니다.");
	
		
		System.out.println("프로그램 종료");
		
		
		
		
// 20이상이면 성년, 아니면 미성년	
	/*	
		Scanner sc = new Scanner(System.in);
		
		int age = sc.nextInt();
		
		if(age >= 20)
			System.out.println("성년");
		else
			System.out.println("미성년");
*/
		

	}

}
