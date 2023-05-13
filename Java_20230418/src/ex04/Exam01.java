package ex04;

class Member{
	private String name;  // private 접근 제어자, 함수통해서만 통과가능(11줄)
	private int age;      // name, age 멤버변수
	
	// 디폴트 생성자는 자바가 직접 생성한다. 다만, 개발자가 생성자를 생성하지 않는 경우에만 만들어준다. 객체가 생성될때 실행
	// 생성자 ==> 반환타입x, 클래스이름과 같다. 오버로딩이 가능하다. 초기화 기능을 가지고 있다.
	public Member(String name, int age) {  // name, age로 이름을 바꿔주면 (지역변수) 5줄-> 멤버변수와 충돌, 지역변수가 먼저라 null값이 나옴.
		this.name = name;  // 그래서 앞에 this.을 붙여준다.
		this.age = age;     // this --> 1. 지역변수와 멤버변수가 충돌날 때 this를 붙이면 멤버변수를 의미
		                    //          2. 생성자를 찾을때...
	}
	
	public Member() {
		this("미정의",1);     // 반복되므로 이렇게 줄여서 써줌.
//		this.name = "미정의";
//		this.age = 1;
	}
	
	Member(String name){
		this(name,1);
//		this.name = name;
//		this.age = 1;
	}
	
	void display() {
		System.out.println(name + ", " + age);
	}
	
	void setData(String n, int a) {
		name = n;
		if(a>=0 && a<=120)
			age = a;
		else
			age = 1;
	}
	
}

//정적변수. 정적메소드는 공유자원이면서 지들끼리만 데이터를 주고 받을 수 있다.
public class Exam01 {

	public static void main(String[] args) { 
		
		Member s1 = new Member("구본우", 26); // 생성자를 찾아서 입력 (8줄)
		
//		s1.name = "구본우";
//		s1.age = 26;
		
		Member s2 = new Member("추명선", 26);
		
//		s2.name = "추명선";
//		s2.age = 26;
		
		s1.display();
		s2.display();
		
		Member s3 = new Member(); // 오류 날 경우 생성자를 만들어준다.  (14줄)
		s3.display();
		
		Member s4 = new Member("이성진");
		s4.display();
		
	}

}
