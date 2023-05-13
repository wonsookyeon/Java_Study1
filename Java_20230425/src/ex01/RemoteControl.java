package ex01;

// 인터페이스 선언
public interface RemoteControl {
	//상수(public static final) 생략가능
	public static final int MAX_VALUM = 10;
	int MIN_VALUM = 0; // public static final 생략가능

	// 추상메소드 --> body 없음.
	public void turnOn();
	public void turnOff();
	
	
	// 디폴트메서드 --> 인터페이스에서 사용 (구현해도되고 하지않아도 된다.)
	//               구현클래스에서 재정의 선택가능
	default void setMute(boolean mute) {
		if(mute)
			System.out.println("무음처리 합니다.");
		else
			System.out.println("무음처리 해제합니다.");
	}
	
	// 정적메소드 (public 생략가능)  // 접근하려면 --> 클래스명.
	public static void changeBattery() { 
		System.out.println("건전지를 교체합니다.");
	}

}
