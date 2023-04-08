package ex01;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {

		int jumsu = 90;
		
		String result = null;
		
		//삼항연산자 or 조건연산자
		result = (jumsu >= 60) ? "합격" : "불합격" ;  // (조건문)? 이 참이면 합격, 거짓이면 불합격
		
		System.out.println("당신은 " + result + " 입니다");
		

	}

}
