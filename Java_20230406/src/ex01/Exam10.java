package ex01;

import java.util.Scanner;

public class Exam10 {

// 세 정수를 입력받아서 최대값과 최소값 구하기.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int max,min,total;
		int a,b,c;
		System.out.println("세 정수를 입력하세요.");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
//최대값 구하기
		if (a > b && a > c)
			max = a;
		else
		{
			if (b > c)
				max = b;
			else
				max = c;
		}

//최소값 구하기
		if (a > b && b < c)
			min = b;
		else
		{
			if (a > c && b > c)
				min = c;
			else
				min = a;
		}
		
//		max =  (a>b)?((a>c)?a:c) : ((b>c)?b:c);
//		min =  (a>b)?((b>c)?c:b) : ((a>c)?c:a);

		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);

		System.out.println("프로그램 종료");
		
		

	}

}
