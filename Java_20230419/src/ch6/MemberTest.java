package ch6;


class Bag {
	int capacity; // 용량
	SunCream sun; // 포함관계 SunCream 의 주소값이 들어간다. 33줄
	public Bag() {
		System.out.println("Bag()");
	}
	void move() {
		System.out.println("가방 옮기다.");
	}
	
}

class SunCream {
	int vol;
	public SunCream() {
		System.out.println("SunCream()");
	}
	void cover() {
		System.out.println("선크림 바르다.");
	}
}


public class MemberTest {

	public static void main(String[] args) {
		
		Bag bg = new Bag();
		
		bg.sun = new SunCream();
		bg.move();
		bg.sun.cover();  // bg안에 sun이 포함관계로 있으므로
		
	}

}
