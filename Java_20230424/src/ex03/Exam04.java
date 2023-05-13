package ex03;

/* *클래스에서 사용할 수 있는 것
 * --> public (어디서나 사용가능) , default (같은 패키지안에서만 사용가능)
 *
 * *변수, 메소드에서 사용할 수 있는 것
 * --> private(같은 클래스안에서만 사용가능), default, public, protected
 */

public class Exam04 {  // public 이 붙은 클래스는 다른 패키지에서도 사용가능
	
	 
	 public void sun() {
		 System.out.println(num);
	 }

	 private int num; // private가 붙으면 같은 클래스안에서만 사용가능
	                        //메소드를 통해서 사용해야한다.
	                        // 타패키지에서는 사용 불가.

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	 
	//------------------------------------------------
	private String name; 
	private int age;
	// Source-> Generate getter and setter 하면 자동으로 생성
	// get,set 사용하면 private 붙어도 다른클래스에서 사용가능
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	 
}

class Study{   // 접근제어자 default 생략
	// public 이 붙지않은 다른 패키지의 default 클래스는 다른 패키지에서 사용불가
	
	int count = 0;
	
}



