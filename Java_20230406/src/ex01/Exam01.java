package ex01;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		
/* 		문제1		
		키보드로 국어, 영어, 수학 점수를 입력받아서
		총점/ 평균을 출력하는 프로그램 작성
*/
		
		
		
		Scanner scanner = new Scanner(System.in);

		int kor, eng, math, total;
		double average; // 평균은 실수값이 나올 수 있으므로 double
		
		System.out.println("국어점수를 입력하세요.");
		kor = scanner.nextInt();
		System.out.println("영어점수를 입력하세요.");
		eng = scanner.nextInt();
		System.out.println("수학점수를 입력하세요.");
		math = scanner.nextInt();
		
		total = kor+eng+math;
		average = total/3.0;  // 3만 입력하면 정수만 출력
		
		System.out.println("총점 :" + total );
		System.out.println("평균 :" + average );
		System.out.printf("평균 : %.2f\n", average);  //printf 는 간격맞출때 씀(실수)   +말고 , 써야됨
	
		
	/*	
		Scanner scanner = new Scanner(System.in);
		
		int a, b, c, total;
		double average; // 평균은 실수값이 나올 수 있으므로 double
  
 		System.out.println("국어, 영어, 수학 점수를 입력하세요.");
 		
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		
		total = a+b+c;
		average = total/3.0;
		
		System.out.println("총점 :" + total );
		System.out.println("평균 :" + average );

		
		Scanner sc = new Scanner(System.in);
		
		int k,e,m,total;
		double average;
		
		System.out.println("국어점수>");
		k = sc.nextInt();
		
		
	*/	
		

		
	}

}
