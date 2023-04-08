package ex01;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		int num = Integer.parseInt(str); // str -> num 으로 바꿔주면 20으로 출력
//		int str = sc.nextInt()
		double d = Double.parseDouble(str);
		
//		System.out.println(str+10); // 문자+정수 이므로 1010 출력
		
		System.out.println(num+10);
		System.out.println("프로그램 종료");

		
		

			
	}

}
