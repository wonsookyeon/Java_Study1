package ex05;

//중첩 인터페이스 : 해당 클래스와 밀접한 관계를 맺는 구현 객체를 만들기 위해서이다. 클래스안에 인터페이스가 있음
public class Button {
	
	// 중첩인터페이스
	public static interface ClickListener{ // 7
		void onClick();
	}
	
	private ClickListener clickListener; // 3.
	
	public void setClickListener(ClickListener clickListener) { // 2.
		                                     // 인터페이스를 구현한 객체의 주소값을 받는다.
		this.clickListener = clickListener;
		
	}
	
	public void click() { // Button이 클릭되었을 때 실행되는 메소드 선언 // 6
		this.clickListener.onClick();
	}
	
}
