package ex01;

import java.util.Scanner;

//은행 입출금기
public class Exam02 {

	public static void main(String[] args) {

		int balance=0;
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		for( ; ; ) {
			System.out.println("-------------------------------");
			System.out.println("1.입금 | 2.출금 | 3.잔액 | 4.종료");
			System.out.println("-------------------------------");
		
			
			num = sc.nextInt();
			
			switch(num) {
			case 1:
				System.out.println("입금액>>");
				balance += sc.nextInt();
				break;
				
			case 2:
				System.out.println("출금액>>");
				balance -= sc.nextInt();
				break;
			case 3:
				System.out.println("잔액 : " + balance);
				break;
			}
		
			if (num==4)
			break;
		}
			
		System.out.println("프로그램 종료");
	}

}
