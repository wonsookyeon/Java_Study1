package ex04;

class Apple{  //사과
	public String toString() {
		return "I am an apple";
	}
}

class Orange{  //오렌지
	public String toString() {
		return "I am an Orange";
	}
}

class Box{  //사과랑 오렌지 함께 담을 박스
	private Object obj;

	public Object getobj() {
		return obj;
	}

	public void setobj(Object obj) {
		this.obj = obj;
	}
	
}


	


public class FruitAndBox {

	public static void main(String[] args) {
		
		Box aBox = new Box();   // 사과
		Box oBox = new Box();   // 오렌지
		
//		aBox.setobj(new Apple());    // 사과 저장
//		oBox.setobj(new Orange());   // 오렌지 저장
//		
//		Apple ap = (Apple)aBox.getobj();  // 꺼내기  //obj랑 Apple랑 타입이 다르기 때문에 (Apple)를 붙여 형변환
//		Orange op = (Orange)aBox.getobj();  // 꺼내기  //obj랑 Orange랑 타입이 다르기 때문에 (Orange)를 붙여 형변환
//		
//		System.out.println(ap1);
//		System.out.println(op1);
		
		
		aBox.setobj("Apple");    // 사과 저장
		oBox.setobj("Orange");   // 오렌지 저장
		
		System.out.println(aBox.getobj());
		System.out.println(oBox.getobj());
		
		
		
//		aBox.setobj("Apple");    // 이렇게 문자열로 바꿔주면 obj는 String을 참조하고 있으므로
//		oBox.setobj("Orange");   
//		
//		String ap1 = (String)aBox.getobj();   // String으로 바꿔줘야함.
//		String op2 = (String)aBox.getobj(); 
//		
//		System.out.println(ap1);
//		System.out.println(op1);
		
		
		
	}

}




