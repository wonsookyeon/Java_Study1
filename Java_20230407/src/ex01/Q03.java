package ex01;

import java.util.Scanner;


/*문제3. 1학년부터 4학년까지 중간고사 시험을 보았다. 
         4학년은 70점 이상이면 합격, 그 이외의 학년은 60점 이상이면 합격이다. 
         이를 판단하는 프로그램을 작성해보자.
         점수가 0미만 100초과이면 경고문구 출력!  ☆☆☆ ok
*/
public class Q03 {

	public static void main(String[] args) {
/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학년입력 >>");
		int grade = sc.nextInt();
		System.out.println("점수입력 >>");
		int score = sc.nextInt();
		
		if (grade == 4 && score >= 70 && score < 100)
			System.out.println("합격");
		else if (grade < 4 && score >= 60 && score < 100)
			System.out.println("합격");
		else if (score < 0 || score > 100)
			System.out.println("1~100까지 숫자입력해라");
		else
			System.out.println("불합격");

		
	System.out.println("프로그램 종료");
	*/			
		
			
		
	
		
		
		Scanner sc = new Scanner(System.in);

		System.out.println("학년을 입력하세요>>");
		int grade = sc.nextInt();
		
		System.out.println("점수을 입력하세요>>");
		int score = sc.nextInt();

		if (grade == 4 && score >= 70 && score < 100)
			System.out.println("4학년 합격");
		else if (grade < 4 && score >= 60 && score < 100)
			System.out.println("그 외 학년 합격");
		else if (score < 0 || score > 100)
			System.out.println("0미만 100초과의 숫자를 입력했다. 경고");
		else
			System.out.println("불합격");
/*		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학년를 입력");
		int num = sc.nextInt();
		System.out.println("점수를 입력");
		int score = sc.nextInt();

		if (num==4 &&score>=70 && score < 100)
				System.out.println("4학년 합격");
			else if(num<4 && score>=60 && score < 100)
				System.out.println("그 외 합격");
			else if(score<0 || score>100)
				System.out.println("경고!!!!");
			else
			System.out.println("불합격");
*/
		
		

	}

}
