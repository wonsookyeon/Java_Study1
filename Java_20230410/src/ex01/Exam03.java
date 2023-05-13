package ex01;

import java.util.Scanner;

/*
 * 사용자로부터 두개의 정수(시작,끝)를 입력받아 시작(포함)해서
 * 끝(포함)까지의 합을 출력
 */
public class Exam03 {

	public static void main(String[] args) {
/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 개의 정수를 입력>>");
		
		int start= sc.nextInt();
		int finish = sc.nextInt();
		int sum=0;
		
		for(int i=start; i<=finish ; i++)
			sum += i;
			System.out.println(sum);
*/		
		
		
		
		
		
		
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자 2개 입력 >>");
		
		int start = sc.nextInt();
		int finish = sc.nextInt();
		int sum=0;
		
		for(int i=start; i<=finish; i++)
			sum += i;
		System.out.println(sum);
			
			
	}

}
