package ex01;

public class Exam01 {

	public static void main(String[] args) {
	
		
		try {
			Class.forName("java.lang.String");
			System.out.println("java.lang.String 클래스가 존재함.");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
		
		
	}
	
}
