package ex01;

import java.util.Scanner;

public class Exam07 {

	
// 성별, 나이 ===> 성별: 남, 나이: 20대 이상이면 군대 간다 아니면 안간다
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
//		System.out.println("성별 입력 >>");
//		String 성별 = sc.nextLine();   //nextLine 은 한줄전체, 엔터기능까지 포함 한번 더 쓰면 엔터기능 삭제
		
		System.out.println("나이 입력>>");
		int 나이 = sc.nextInt();  //nextInt 는 정수
		
		sc.nextLine(); //엔터제거기능 //나이,성별 입력순서 바꿀때 넣어줘야 함.
		System.out.println("성별 입력 >>");
		String 성별 = sc.nextLine();
		
		
		if (성별.equals("남")) { //성별 == "남" 안됨 , 문자열 비교는 == 아니고 equals로, 기본형은 == 가능
			if(나이>=20)
				System.out.println("군대 간다");  // 위의 if가 참일때 실행
			else
				System.out.println("군대 안간다");
		}
		else
			System.out.println("군대 안간다");
		
		System.out.println("프로그램 종료");
	
				
				
	}

}
