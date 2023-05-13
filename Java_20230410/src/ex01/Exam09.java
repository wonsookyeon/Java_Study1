package ex01;

import java.util.Scanner;

/*
 * for문은 무한반복...... 처리해준다. (for + switch 조합)
 */
public class Exam09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
/*
		int balance = 0;

		for (; true;) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");

			
			System.out.print("선택>");
			int num = sc.nextInt();

			switch (num) {
			case 1:
				System.out.println("예금액");
				balance += sc.nextInt();
				break;
			case 2:
				System.out.println("출금액");
				balance -= sc.nextInt();
				break;
			case 3:
				System.out.println("잔고>");
				System.out.println("현재 잔고 : " + balance);
				break;

			}

			if (num == 4)
				break;
		}

		System.out.println("프로그램 종료.");
	}
}
*/
		int balance=0;
		
		for( ; ; ) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");
			
			System.out.print("선택>");
			int num=sc.nextInt();
			
			switch(num) {
			case 1:
				System.out.println("예금액");
				balance += sc.nextInt();
				break;
				
			case 2:
				System.out.println("출금액");
				balance -= sc.nextInt();
				break;
				
			case 3:
				System.out.println("현재잔고 : " + balance);
				break;
				
		}
			if(num==4) break;
			
		}
		
		System.out.println("프로그램 종료");
		

	
		}
	}

