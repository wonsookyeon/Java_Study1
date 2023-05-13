package ex02;

public class Exam01 {

	public static void main(String[] args) {
		System.out.println("[프로그램 시작]");
		printLength("Thisisjava");
		printLength(null);
		System.out.println("프로그램 종료");
	}
	
	
	private static void printLength(String data) {
		int result = 0;
		try {
		 result = data.length(); 
		} catch(NullPointerException e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
			
		}
		System.out.println("문자수 : " + result);
	}
	
	
//		int result = data.length(); // 문제발생해서 try에 넣어주기
//		System.out.println("문자수 : " + result);
//	
//	}
	
	
}
