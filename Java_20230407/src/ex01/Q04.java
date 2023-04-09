package ex01;

import java.util.Scanner;

//문제4. 사용자로부터 세 개의 정수를 입력받아, 그 수들의 ★최대값과 최소값, 합계와 평균★을 구해보자.
public class Q04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("세 개의 숫자를 입력하세요.>>");
		
		
		int a,b,c,max,min,total;
		double average;
		
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		total = a+b+c;
		average = total/3;
		
		if (a>b && a>c) 
			max=a;
			else if(b>c)
				max=b;
			else
				max=c;
		
		System.out.println("최대값 : " + max);
		
		if (a<b && a<c)
			min = a;
		else if(b<a && b<c)
			min= b;
		else
			min=c;
		
		System.out.println("최소값 : " + min);
		
		System.out.println("합계 : " + total);
		System.out.printf("평균 : %.2f" , average);
		
		
		
		
		
		
		
		
		
		
		
		
/*		
		Scanner sc = new Scanner(System.in);

		System.out.println("세개의 숫자를 입력하세요>>");

		int a,b,c;
		int max, min, total;
		double average;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		if (a > b && a > c)
			max = a;
		else {
			if (b > c)
				max = b;
			else
				max = c;
		}
		
		if (a>b && b<c)
			min = b;
		else {
			if (a>c && b>c)
				min=c;
			else min = a;
		}
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
		total = a + b + c;
		average = total/3.0;

		System.out.println("합계 : " + total);
		System.out.printf("평균 : %.2f ", average); // printf는 + 말고 , 넣어야 됨
*/		
		
		}
	}

