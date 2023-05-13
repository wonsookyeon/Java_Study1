package ex02;


class Unit{
	int x, y;
	
	void move(int x, int y) { // 지정된 위치로 이동    // ↓ 자손에게 오버라이딩
	}
	
	void stop() { // 현재 위치에 정지
	}
}

class Marine extends Unit {  //보병
	void stimpack() { // 스팀팩을 사용한다.
	}
	void move(int x, int y) { // 지정된 위치로 이동
		System.out.println("걸어서 이동");   // 오버라이딩
	}
	
}

class 비행기 extends Unit{
	void move(int x, int y) { // 지정된 위치로 이동
		System.out.println("날아서 이동");   // 오버라이딩
	}
}

class Tank extends Unit { // 탱크
	void changeMode() { // 공격모드를 변환한다.
	}
	void move(int x, int y) { // 지정된 위치로 이동
		System.out.println("탱크로 이동");   // 오버라이딩
	}
}

class Dropship extends Unit {  //수송선
	
	void load() { //선택된 대상을 태운다.
	}
	
	void unlaod() { //선택된 대상을 내린다.
	}
	void move(int x, int y) { // 지정된 위치로 이동
		System.out.println("배로 이동");   // 오버라이딩
	}
}

public class Exam02 {

	public static void main(String[] args) {
		
		Dropship dr = new Dropship();
		move(dr);
		Marine mr = new Marine();
		move(mr);
		Tank ta = new Tank();
		move(ta);
		비행기 비 = new 비행기();
		move(비);

	}
	static void move(Unit u) {
		u.move(10,10);
	}

}
