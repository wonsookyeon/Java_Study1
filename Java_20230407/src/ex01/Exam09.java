package ex01;

import java.util.Scanner;

// 학점 구하기(Exam02)를 switch문으로 변경
public class Exam09 {
	
	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		System.out.println("성적을 입력하세요(1~100)>>");
		int num = sc.nextInt();

		switch (num / 10) {
		case 10:
		case 9:
			System.out.println("A학점");
			break;

		case 8:
			System.out.println("B학점");
			break;

		case 7:
			System.out.println("C학점");
			break;

		case 6:
			System.out.println("D학점");
			break;

		default:
			System.out.println("F");
		}

		System.out.println("프로그램 종료");

		/*		// case문의 갯수를 최대한 줄이는 것이 중요!
		switch (num) {
			case 100: case 99: case 98: case 97: case 96: case 95: case 94: case 93: case 92: case 91: case 90:
				System.out.println("A학점");
				break;
				
			case 89: case 88: case 87: case 86: case 85: case 84: case 83: case 82: case 81: case 80:
				System.out.println("B학점");
				break;
				
			case 79: case 78: case 77: case 76: case 75: case 74: case 73: case 72: case 71: case 70:
				System.out.println("C학점");
				break;
				
			case 69: case 68: case 67: case 66: case 65: case 64: case 63: case 62: case 61: case 60:
				System.out.println("D학점");
				break;
				
			default :
				System.out.println("F학점");
				break;
				
			
	}
	
		System.out.println("프로그램 종료");
 */				
	}

}
