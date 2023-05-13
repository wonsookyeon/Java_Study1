package ex02;

abstract class Animal{   // abstract 추상클래스
	
	abstract void makeSound();  // 추상클래스가 됨으로서 에러가 나기때문에 {}안에 내용 삭제 후, abstract 붙여줌으로서 추상메서드가 됨
}                               // 쓰려면 하위클래스에서 Animal을 상속받고 꼭 ★오버라이딩, 재정의해서 사용해야함.★
                                // 원래는 오버라이딩하면 재정의하지않아도 상위클래스의 메서드가 실행되었으나 추상메서드로 변환하면 꼭 재정의 해야 사용가능.


class Cat extends Animal{
	
	@Override  // 어노테이션 // 입력권장, 사용자의 실수를 잡아줌.
	// Override --> 상위클래스는 재정의 하겠다는 적극적 표현
	void makeSound() {
		System.out.println("야옹~야옹~");
	}
}

class Dog extends Animal{
	void makeSound() {
		System.out.println("멍멍~멍멍~");
	}
}

class Pig extends Animal{
	void makeSound() {
		System.out.println("꿀꿀~꿀꿀~");
	}
}

class Rabbit extends Animal{
	void makeSound() {
		System.out.println("토끼~토끼~");
	}
}

class 호랑이 extends Animal{
	void makeSound() {
		System.out.println("어흥~어흥~");
	}
}


public class AnimalTest {

	// 고양이-야옹, 강아지-멍멍, 돼지-꿀꿀.....짖는 소리
	public static void main(String[] args) {
		Animal[] animals = {new Cat(), new Dog(), new Pig(), new Rabbit(), new 호랑이()};
		
//		for(int i=0; i<animals.length; i++)
//			animals[i].makeSound();
		for(Animal animal : animals)  // 향상된 for문  for(변수 단수:복수)
			animal.makeSound();
		System.out.println("-----------------------");
		
		//Animal an = new Animal();
		//an.makeSound();
		
		Dog d = new Dog();
		d.makeSound();
		

	}

}


