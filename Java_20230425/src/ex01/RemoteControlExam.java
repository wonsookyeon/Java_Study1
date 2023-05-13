package ex01;

public class RemoteControlExam {

	public static void main(String[] args) {
		
		RemoteControl rc = new Television();
		rc.turnOn();
		rc = new Audio();
		rc.turnOn();
		rc.setMute(true);
		//rc 는 search에 접근 불가
		
		Television tel = new Television();
		tel.search(null);
		
		Searchable se = new Television();
		se.search(null);
		
		
		System.out.println(RemoteControl.MAX_VALUM);
		
		RemoteControl.changeBattery(); // 외부에서 접근

	}

}
