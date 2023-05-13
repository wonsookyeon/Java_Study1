package ex02;
/*
 * class명 Member, name id password 문자열, age 정수 / login 메소드 호출할때 매개값 id,password, logout 메소드는 id만 제공
 * 로그인 리턴타입은 boolean, 로그아웃은 void
 * id는 "홍길동", password는 "12345" 일 경우만 true로 리턴
 */
class Member{
	String name;
	String id; // 인스턴스 변수... 변수/멤버변수
	String password;
	int age;
	
	// 인스턴스메소드 --> 클래스 메소드, 정적메소드
	static void checkOut() {
		
	}
	
	   // 인스턴스메소드
	boolean login(String id, String password) {  //지역변수 id // 리턴타입 boolean
		
		if(id.equals("홍길동")&& password.equals("12345"))
		return true;
		else return false;
	}
	
	  // 인스턴스메소드
	void logout(String id) { // 인스턴스메소드 // 리턴타입 void
		System.out.println(id + "님이 로그아웃되었습니다.");
	}
}

public class MemberTest {
	
	static int test = 10; // method에 저장
	
	public static void main(String[] args) {
		
//		int[]num = new int[5]; // 지역변수 // stack에 저장
		Member[] mem = new Member[5];
		mem[0] = new Member();


	}

}
