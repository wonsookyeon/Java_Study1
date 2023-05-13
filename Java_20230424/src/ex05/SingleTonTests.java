package ex05;

import java.util.Calendar;

class Sample{
	
}

class Singleton{
	private static Singleton instance;
	
	private Singleton() {} // 생략가능
	
	
	public static Singleton getInstancec() { // static이 없으면 밑에서 접근불가

		if(instance == null)
			instance = new Singleton();
	
		return instance;
	}
}


public class SingleTonTests {

	public static void main(String[] args) {
		Sample s1 = new Sample();
		Sample s2 = new Sample();
		
		System.out.println(s1 == s2); // false
		System.out.println("--------------");
		
		//Singleton sing1 = new Singleton(); //에러 이유 : Singleton 생성자 자체가 private라서 다른클래스에서 접근불가능, 만들 수 없다. 
		Singleton.getInstancec();
	//  클래스명.변수명
		
		
		Singleton sing1 = Singleton.getInstancec();
		                  // 클래스명.변수명   으로 써주면 접근가능.
		//System.out.println(sing1);
		Singleton sing2 = Singleton.getInstancec();
		//System.out.println(sing2);
		
		System.out.println(sing1 == sing2);
		System.out.println("-------------------");
		
		//Calendar now = Calendar.getInstance();
		//System.out.println(now.getTime());
		System.out.println(Calendar.getInstance().getTime());
		
		

	}

}
