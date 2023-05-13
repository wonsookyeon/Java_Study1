package ex01;

import java.util.Scanner;

/*
 * 사용자로부터 두개의 정수(시작,끝)를 입력받아 시작(포함)해서
 * 끝(포함)까지의 합을 출력
 */
public class Exam04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 개의 정수를 입력>>");
		
		int start= sc.nextInt();
		int finish = sc.nextInt();
		int sum=0;
		int i;  // int 를 for 밖으로 빼주어 전체 int로 넣어주기
	
		
		for(i=start; i<=finish ; i++) 
			sum += i;
	
		
			System.out.println(sum);
			System.out.println(i);
			
			
	}

}
