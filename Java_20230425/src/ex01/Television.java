package ex01;

// RemoteControl 인터페이스 구현
public class Television implements RemoteControl, Searchable{

	public static void main(String[] args) {
		

	}

	@Override
	public void turnOn() {
		System.out.println("Tv를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Tv를 끕니다.");
		
	}

	@Override
	public void search(String url) {
		System.out.println(url + "을/를 검색합니다.");
		
	}

}
