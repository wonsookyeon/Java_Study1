package ex04;

public class Exam01 {

	public static void main(String[] args) {
		
		try {
			findClass();   // 1시작  // 5
		}catch(Exception e) {       // 6
			e.printStackTrace();    // 7
		}
		
		
		System.out.println("프로그램 종료");   // 8
		
	}
	
	
		public static void findClass() throws ClassNotFoundException {  // 3 throw(나를 호출했던 문장에게 던짐)
			
			
			Class.forName("java.lang.String2");   // 2
			
		}
	
}