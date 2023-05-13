package ex08;


class Parent{
	public String name;
	
	public Parent(String name) {
		this.name = name;
	}
}

class Child extends Parent {
	public int studentNo;  //name 이 없기때문에 parent클래스에서 상속받아야한다.
	
	public Child(String name, int studentNo) {
		super(name);
		this.studentNo = studentNo;
	}
	
	
}
public class Exam {

	public static void main(String[] args) {
		
		Child ch = new Child("까미",1);
		

	}

}
