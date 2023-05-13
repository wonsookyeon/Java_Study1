package ex02;

class Member{
	private String name;  // private 접근 제어자, 함수통해서만 통과가능(11줄)
	private int age;
	
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
		
		Member s1 = new Member();
		s1.setData("구본우", 20);
		
//		s1.name = "구본우";
//		s1.age = 26;
		
		Member s2 = new Member();
		s2.setData("추명선", 26);
		
//		s2.name = "추명선";
//		s2.age = 26;
		
		s1.display();
		s2.display();
		
	}

}
