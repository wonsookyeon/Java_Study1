package ex01;

class Member{
	String name;
	int age;
	int num;
	
	static int ban=100;
	static String ac;

	void func() {};
	void info() {
		age = ban;
		ban = num;
		func();
		info2();
		sInfo();
	}
	
	static void info2() {};
	
	static void sInfo() {
		ban = 200;
		info2();
		ac = "이젠";
		
//		num = 20;
//		name = 홍길동;
//		info();
//		age = 20;
	}
	
}

//정적변수. 정적메소드는 공유자원이면서 지들끼리만 데이터를 주고 받을 수 있다.
public class Exam01 {

	public static void main(String[] args) {
		
		Member m = new Member();
		
		m.info();
		System.out.println(m.age);
		System.out.println(m.num);
		System.out.println(m.ban);

	}

}
