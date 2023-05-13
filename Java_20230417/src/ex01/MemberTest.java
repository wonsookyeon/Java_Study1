package ex01;
/*
 * class명 Member, name id password 문자열, age 정수 / login 메소드 호출할때 매개값 id,password, logout 메소드는 id만 제공
 * 로그인 리턴타입은 boolean, 로그아웃은 void
 * id는 "홍길동", password는 "12345" 일 경우만 true로 리턴
 */
class Member{
	String name;
	String id;
	String password;
	int age;
	
	boolean login(String id, String password) {  // 리턴타입 boolean
		
		if(id.equals("홍길동")&& password.equals("12345"))
		return true;
		else return false;
	}
	
	void logout(String id) { // 리턴타입 void
		System.out.println(id + "님이 로그아웃되었습니다.");
	}
}

public class MemberTest {
	
	public static void main(String[] args) {
		
		Member m = new Member(); //
		
		boolean b = m.login("로이", "1234");  // 15줄 if문으로 가서 실행, false 이므로 false를 return 받아 ↓else문 출력
		if(b==true)
			System.out.println("로그인 성공");
		else
			System.out.println("로그인 실패");
		
		
		boolean b2 = m.login("홍길동", "12345"); //15줄 if문으로 가서 실행, true이므로 true 로 return받아 ↓if문 출력
		if(b2==true)
			System.out.println("로그인 성공");
		else
			System.out.println("로그인 실패");
		
		
		m.logout("홍길동");  //20줄 실행

	}

}
