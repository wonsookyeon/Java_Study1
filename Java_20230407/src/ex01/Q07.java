package ex01;

import java.util.Scanner;

//문제7. 정수 3개를 입력받아서 총점과 평균을 구하고 학점을 구하는 프로그램 작성 ( 90이상이면 A,80이상이면 B, 70이상이면 C,60이상이면 D, 나머지는 F)ok
public class Q07 {

	public static void main(String[] args) {
/*		
		int a,b,c,total;
		double average;
		
		System.out.println("점수를 입력>>");
		
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		total=a+b+c;
		average=total/3;
		
		System.out.println("총점 : " + total);
		System.out.printf("평균 : %.2f\n" , average);
		
		if (average>=90)
			System.out.println("A");
		else if (average>=80)
			System.out.println("B");
		else if (average>=70)
			System.out.println("C");
		else if (average>=60)
			System.out.println("D");
		else
			System.out.println("F");
*/
		
		
		

		
		int a,b,c,total;
		double average;
		
		System.out.println("정수 3개를 입력하세요.");
		
		Scanner sc = new Scanner(System.in);
		
		a= sc.nextInt();
		b= sc.nextInt();
		c= sc.nextInt();
		
		total = a+b+c;
		average = total/3;
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + average);
		
		
		if(average>=90)
			System.out.println("A");
		else if (average>=80)
			System.out.println("B");
		else if (average>=70)
			System.out.println("C");
		else if (average>=60)
			System.out.println("D");
		else
			System.out.println("F");
		
		
	
		
	}

}
