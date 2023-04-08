package ex01;

import java.util.Scanner;

public class FlowEx5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int score = 0;
		char grade = ' ', opt = '0';

		System.out.println("점수를 입력해주세요.");
		score = sc.nextInt();
		
		System.out.printf("당신의 점수는 %d입니다. %n", score);
		
		if (score>=90) {
			grade = 'A';
		}
		

	}

}
