package ex07;

public class Home {
	// private RemoteControll rc = //(RemoteControll을 구현한 클래스)
	
	
	                             //익명 구현객체
	private RemoteControll rc = new RemoteControll() {
		
		@Override
		public void turnOn() { //3 출력
			System.out.println("TV 켭니다");
		}
		
		@Override
		public void turnOff() { // 5
			System.out.println("TV 끕니다");
		}
	};
	
	public void use1() { 
		rc.turnOn();  // 2
		rc.turnOff();  // 4
		
	}
	
	public void use2(RemoteControll rc) {
		rc.turnOn();
		rc.turnOff();
	}

}
