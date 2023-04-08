package ex01;

import java.util.Scanner;

//컴퓨터랑 가위바위보 게임
public class Exam08 {
	
	public static void main(String[] args) {
		
//		int random = (int)(Math.random()*10)+1; //0~9 정수 ==> +1을 함으로서 1~10까지 정수가 나옴
/*		
		int com = (int)(Math.random()*3)+1;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1(가위), 2(바위), 3(보) 중 입력하세요.");
		int user = sc.nextInt();
		
		switch(user-com) {
		case 0 :
			System.out.println("비김");
			break;
		case -2 :
		case 1 :
			System.out.println("User 승!");
			break;
		case -1 :
		case 2 :
			System.out.println("User 패!");
			break;
		}
		System.out.println("User : " + user + ", Come : " + com);
*/
		
		int com = (int)(Math.random()*3)+1;
		Scanner sc = new Scanner(System.in);
		System.out.println("1(가위),2(바위),3(보) 중 입력하세요");
		int user = sc.nextInt();
		
		switch (user - com) {
		case 0:
			System.out.println("비김");
			break;
		case -2:
		case 1:
			System.out.println("이김");
			break;
		case 2:
		case -1:
			System.out.println("패배");
			break;
		}
		
		System.out.println("User : " + user + " Com : " + com);
	}

}
