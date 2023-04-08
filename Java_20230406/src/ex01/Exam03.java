package ex01;

import java.util.Scanner;

/*
 * 나의 이름, 주소, 나이(만으로 입력)를 입력 받아서 출력하는 프로그램 작성..(단 나이는 +1해서 출력)
 */

public class Exam03 {

	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);
		
//		int age = sn.nextInt();   //int를 맨위로 올려 순서를 바꾸려면
//		sn.nextLine();   //입력버퍼에 남아있는 엔터를 제거
		//이유는 엔터를 제거하지 않으면 String name = sn.nextLine()이 문장에서 엔터를
		//문장으로 인식해서 버퍼에 남은 엔터를 name변수에 넣는다.
		
		String name = sn.nextLine();		
		String address = sn.nextLine();		
		int age = sn.nextInt();
		
		System.out.println("이름 : " + name);
		System.out.println("주소 : " + address);
		System.out.println("나이 : " + (age+1));
		

	}

}
