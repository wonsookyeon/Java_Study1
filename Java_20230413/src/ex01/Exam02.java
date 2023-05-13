package ex01;

import java.util.Arrays;

public class Exam02 {

	public static void main(String[] args) {
		
		String[] str = new String[3];  // str 에 3개의 배열생성
		str[0] = "kor";
		str[1] = "eng";
		str[2] = "math";  // 각각 배열에 문자 입력
		
		String[] str2 = new String[] {"kor2", "eng2", "math2"};
		            //  new String[] 생략가능
		
		System.out.println(Arrays.toString(str));
		System.out.println(Arrays.toString(str2));

//----------------------------------------------------------------------------------------
		String msg = "Korea";
		
		char ch = msg.charAt(0); // 0번째 문자 출력 
		System.out.println(ch);
		
		msg.length();  // 문자의 길이
		System.out.println(msg.length());
		
		
		String msg2 = msg.substring(2); // (2)번째 문자부터 출력
//		String msg2 = msg.substring(0,3); // 0번째부터 2번째까지 출력
                             //(start, end-1)
		System.out.println(msg2);
		
		
		msg.equals(msg2); // msg2와 비교
		// int a , int b   a==b(기본자료형비교)
		//기본형 외 참조형은 equals(b) -가지고있는 주소값을 비교하기때문에 참조형은 이렇게 써야함.
		
				
		char[] ch2 = msg.toCharArray(); // 문자를 문자배열로 변경시켜서 하나씩 나눔.
		System.out.println(Arrays.toString(ch2)); // 배열 출력
		
		
		
	}

}
