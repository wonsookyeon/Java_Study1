package ex06;

// interface 는 다중상속
interface Animal{   // interface 는 abstract 이나 final만 사용가능 
	void eat();     //public abstract 생략가능
	public abstract void sleep();
	
	default void sound() {};  // 쓸거면 구현하고 안쓸거면 말아라 선택주는 문장 // 쓴다면 --> 24줄
}


class Cat implements Animal{

	@Override
	public void eat() {
		System.out.println("고양이는 먹는다.");
	}

	@Override
	public void sleep() {
		System.out.println("고양이는 잔다.");
	}
	
	public void sound() {
		System.out.println("야옹~");
	}
	
}


class Dog implements Animal{

	@Override
	public void eat() {
		System.out.println("강아지는 먹는다.");
	}

	@Override
	public void sleep() {
		System.out.println("강아지는 잔다.");
	}
}


public class Exam01 {

	public static void main(String[] args) {
		
//		Dog dog = new Dog();
//		dog.eat();
//		dog.sleep();
//		
//		Animal an = new Animal(); // 불가능, ↓참조는 가능
		Animal an = new Dog();
		an.eat();
		an.sleep();
		
		an = new Cat();
		an.eat();
		an.sleep();

	}
}


