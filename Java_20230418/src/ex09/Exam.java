package ex09;


class Parent {
	public String nation;
	
	public Parent() {
		this("대한민국");  // 3. 생성자 호출 12줄로 내려가서 // 5.↓ 내려가서 출력
		System.out.println("Parent() call"); //6. 출력후 21줄로
	}
	public Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call"); // 4. 출력 후 8줄로 다시
	}
}

class Child extends Parent {
	public String name;  //
	
	public Child() {
		this("홍길동"); // 2. super(); 생략,  super가 없기때문에 default 생성자인 7줄로 // 7. 이미 호출받고 있으므로 24줄로
		System.out.println("Child() call"); // 10. 출력
	}
	public Child(String name) {  // 8. 내려가서 실행 후
		this.name = name;
		System.out.println("Child(String name) call"); // 9.출력 후 아까 실행하지못한 21줄로 올라가서 실행 후 
	}
	
}
public class Exam {

	public static void main(String[] args) {
		
		Child child = new Child();  // 1. 디폴트값인 20줄부터 실행
		

	}

}
