package oop01;
// 1. 클래스는 왜 나왔을까?
// 클래스 없이도 객체의 특징(속성)들을 변수로 정의할 수 있을 것이고, 동작은 함수로 정의할 수 있을 것이다.
// 그러나 프로그램의 규모가 커지고 여러 사람이 협업을 하는 과정에서 좀더 체계적이고 분업화된 시스템으로 개발하고 확장해나갈 필요성이 있다.
// 그런 일련의 과정에서 OPP(객체 지향 프로그래밍)가 만들어지고 발전해왔다.

// 2. 클래스 만들기
// 객체의 특징 --> 속성(attribute)
// 객체의 동작 --> 메서드(method)

// FarmMachine의 속성과 동작들을 가지는 클래스를 코드로 구현하고 객체를 생성하여 동작시켜보시오. 

class FarmMachine {
	
	// 1. 속성(특징)
	int price;     //가격
	int year;      //연식
	String color;  //색상
	
	// 2. 동작/기능/행동(method) --> 농기계 마다 동작이 다양할 것이므로 처음에는 공통적인 동작을 생각해본다.
	void move() {
		System.out.println("Farm-machine is moving.");
	}
	
	void dig() {
		System.out.println("Farm-machine is digging.");
	}
	
	void grind() {
		System.out.println("Farm-machine is grinding.");
	}

}

public class Practice_OOP_02 {

	public static void main(String[] args) {
		
		// 1. 객체 생성
		FarmMachine fm = new FarmMachine();
		System.out.println(fm);  // 주소값 출력
		
		// 2. 생성된 객체에 속성 값 입력하기
		fm.price = 10000000;
		fm.year = 2020;
		fm.color = "red";
		
		// 3. 속성 값 출력하기
	  //String fm_price = String.format("%,d", 1000000);  // 1000000원을 가진 변수를 천단위로 콤마를 찍어서 출력
	  //System.out.println(fm_price);
		System.out.println(String.format("%,d",fm.price));  // 1000000원을 가진 변수를 천단위로 콤마를 찍어서 출력
	  //System.out.println(fm.price);
		System.out.println(fm.year);
		System.out.println(fm.color);
		
		// 4. 동작 수행하기
		fm.move();
		fm.dig();
		fm.grind();
		
		
	}

}
