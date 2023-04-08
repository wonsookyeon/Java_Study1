package ex01;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		/*
		int num = 8;
		int cnt = 3;
		
		System.out.println(num / cnt);  // 2 (몫)
		System.out.println(num % cnt); // 2 (나머지)
		*/
		
		
		
		
		
		// 키보드로 4000을 입력받는다. 4000초
		// 화면 상 출력
		// 1시간 6분 40초
/*		
		Scanner scanner = new Scanner(System.in);
				
				String input = scanner.nextLine();
				int num = Integer.parseInt(input);
				
				int hour = num/3600;
				int min = (num-3600)/60;
				int sec = num%60;
			
		
		System.out.println( hour + "시간 " + min + "분 " + sec + "초");
*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("계산할 초를 입력 >>");
		int num = sc.nextInt();
		
		int hours = num / 3600;  //시간 계산
		int min = (num % 3600) / 60 ; // 분 계산 ( 4000/3600= 시간(몫) 나머지를 60초로 나누면 분 계산
		int sec = num % 60; // 초 계산
		
		System.out.println( hours + "시간 " + min + "분 " + sec + "초");
		
		
		
	}

}
