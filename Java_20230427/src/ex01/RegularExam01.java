package ex01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExam01 {

	public static void main(String[] args) {
		
		String str = "1234567890";
		
		Pattern p = Pattern.compile("^[0-9]*$");  //정규식  // 숫자만 입력해라
		Matcher m = p.matcher(str); // str이 정규 표현식과 일치하는지 판단
		System.out.println(m.find());  //숫자만 들어있으면 true, 문자가 껴있으면 false
		
		
		System.out.println("---------------------");
		
		
		String str2 = "123ABC";        
		
		Pattern p2 = Pattern.compile("^[0-9A-Z]{6}$");   // 6자 입력, 단 숫자하고 대문자만 입력해라
		Matcher m2 = p2.matcher(str2);
		System.out.println(m2.find());
		
		
		System.out.println("-------------------");
		
		
		String str3 = "aa12a@naver.com";
		
		Pattern p3 = Pattern.compile("[\\w]*@[\\w]*.com$");   // aa12a@naver.com 이런식으로 입력해라 (com으로 끝나야됨)
		Matcher m3 = p3.matcher(str3);
		System.out.println(m3.find());
		
		
		System.out.println("-------------------");
		
		String str4 = "eee";
		
		Pattern p4 = Pattern.compile("^[^b|c].{2}$"); // ^ -> 처음시작부터 3글자 확인
		                                              // $ -> 맨끝부터 3글자 확인
		                                              // 둘다 없을때는 어느자리에나 조건에 맞는 3글자 있으면 true
		                                              // 둘다 있으면 배열3개 고정해서 3개의 숫자만 넣을 수 있음.
		Matcher m4 = p4.matcher(str4);
		System.out.println(m4.find());
		
		
	}

}
