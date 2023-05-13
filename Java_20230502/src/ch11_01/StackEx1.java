package ch11_01;
//자바의 정석 608p

import java.util.Stack;

public class StackEx1 {

	public static Stack back = new Stack(); // static : 객체생성하지않고 하기위해
	public static Stack forward = new Stack();
	
	
	public static void main(String[] args) {
		
		goURL("1. 네이트");
		goURL("2. 야후");
		goURL("3. 네이버");
		goURL("4. 다음");
		
		printStatus();
		
		goBack();
		System.out.println("= '뒤로' 버튼을 누른 후 =");
		printStatus();
		
		goBack();
		System.out.println("= '뒤로' 버튼을 누른 후 =");
		printStatus();
		
		goForward();
		System.out.println("= '앞으로' 버튼을 누른 후 =");
		printStatus();
		
		goURL("codechobo.com");
		System.out.println("= 새로운 주소로 이동 후 =");
		printStatus();

	}
	
	public static void printStatus() {
		System.out.println("back : " + back);
		System.out.println("forward : " + forward);
		System.out.println("현재화면은  '" + back.peek()+"' 입니다."); // peek : 맨위에 들어간 것
		System.out.println();
	}
	
	public static void goURL(String url) {
		back.push(url);
		if(!forward.empty())  //forward 가 비어있지않으면
			forward.clear();  // forward를 비워라
	}
	// pop: 꺼내다. / push: 넣다.
	public static void goForward() {
		if(!forward.empty())    //forward 가 비어있지않으면
			back.push(forward.pop());  // forward 에서 하나빼서 back 에 넣어라.
	}
	
	public static void goBack() {
		if(!back.empty())        //back 이 비어있지않으면
			forward.push(back.pop()); //back 에서 하나빼서 forward 에 넣어라.
	}
	

}
