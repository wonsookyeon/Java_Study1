package ex03;

class Robot{  // action 메서드를 작성하시오
	void funcR() {}  // 만들어서 오버라이딩 시킴 하위클래스에 ↓
}

class DanceRobot extends Robot{
	void dance() {
		System.out.println("춤을 춥니다.");
	}
	void funcR() {
		System.out.println("춤을 춥니다.");
	}
}

class SingRobot extends Robot{
	void sing() {
		System.out.println("노래를 합니다.");
	}
	void funcR() {
		System.out.println("노래를 합니다.");
	}
}

class DrawRobot extends Robot{
	void draw() {
		System.out.println("그림을 그립니다.");
	}
	void funcR() {
		System.out.println("그림을 그립니다.");
	}
}


public class Exam02Robot {

	static void action(Robot r) {   // r에는 Robot 하위클래스인 (DanceRobot SingRobot DrawRobot) 들어갈 수 있음 // 참조가능
		r.funcR();
	}
//		DanceRobot d= (DanceRobot)r;
//		d.dance();
		
//		if (r instanceof DanceRobot) { // r이 참조하고 있는 대상이 DanceRobot 이면 true ↓실행, 아니면 false
//			DanceRobot d = (DanceRobot)r;
//			d.dance();
//		}else if(r instanceof SingRobot) {  // r이 참조하고 있는 대상이 SingRobot 이면 true ↓실행, 아니면 false
//			SingRobot s = (SingRobot)r;
//			s.sing();
//		}else if(r instanceof DrawRobot) {  // r이 참조하고 있는 대상이 DrawRobot 이면 true ↓실행, 아니면 false
//			DrawRobot dr = (DrawRobot)r;
//			dr.draw();
//		}	
//		
//	}
	
	public static void main(String[] args) {
		
		
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot()};
		
		for(int i=0; i<arr.length; i++)
			action(arr[i]);
		
	}
		
}
