package ex01;

import java.util.Scanner;

/*
 * 랜덤함수 1~100 사이 숫자를 가지고 있다.
 * 유저가 컴퓨터 숫자를 맞추는 게임
 */
public class Exam12 {

	public static void main(String[] args) {
		
		int com = (int)(Math.random()*100)+1;
//				System.out.println(com);
		int count =0;
		Scanner sc = new Scanner(System.in);
		int user=0;
		
		while(true){
			System.out.println("정수입력>>");
			user = sc.nextInt();
			count++;
			if (com==user) {
				System.out.println("정답입니다.");
				break;
			}else if (com>user)
			System.out.println("com은 큰 수 입니다.");
			else if (com<user)
			System.out.println("com은 작은 수 입니다.");
		}
		System.out.println("맞춘횟수 : " + count);
		System.out.println("com : " + com + " user : " + user);
		System.out.println("프로그램 종료");
		
		
		
/*		
		int i;
		int user = 0;
		
		for(i=1; ; i++) {
			System.out.println("숫자입력 >>");
			Scanner sc = new Scanner(System.in);
			user = sc.nextInt();
			if(user==com) break;
		}else if (com>user)
			System.out.println("com은 큰 수 입니다.");
		else if (com<user)
			System.out.println("com은 작은 수 입니다.");
		
		}
		
	System.out.println("맞춘횟수 : " + i);
	System.out.println("com : " + com + " user : " + user);
	System.out.println("프로그램 종료");
*/		
		
		
		
/*			while(i<100) {
			if(i!=com) continue;
			if(i==com) break;
			System.out.println("정답입니다.");
		 */		
	}

}
