package ex04;

class Member{
	               // 멤버변수
	int age;       // 인스턴스 변수
	static int num; // 클래스변수, 정적변수, 공유변수
}

class Member2{
	int age;       // 인스턴스 변수
	static int num; // 클래스변수, 정적변수, 공유변수
}

public class MemberTest { // public 은 2개 존재할 수 없다.

	public static void main(String[] args) {  //public 안에 main method가 들어가있어야한다.
		
		Member m = new Member();
		m.age = 20;
		m.num = 30;
		
		Member m2 = new Member();
		
		m2 = m; // m의 주소값이 m2로 바뀜
		m2.age = 50;
		
		System.out.println(m.age);
		System.out.println(m2.age);
		System.out.println(m2.num); // num은 static int 공유변수라 공유되서 20줄 30으로 출력
		
	}

}
