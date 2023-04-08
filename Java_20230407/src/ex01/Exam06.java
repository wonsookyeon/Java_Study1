package ex01;

import java.util.Scanner;

//switch문
public class Exam06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("계절입력>");
		String season = sc.nextLine();
		
		switch (season) {
		case "spring":
			System.out.println("봄");
			break;
		case "summer":
			System.out.println("여름");
			break;
		case "fall":
			System.out.println("가을");
			break;
		case "winter":
			System.out.println("겨울");
			break;
		default:
			System.out.println("아직도...");
		}

		System.out.println("프로그램 종료");

	}

}
