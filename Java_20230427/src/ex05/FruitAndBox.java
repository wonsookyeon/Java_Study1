package ex05;

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

class Box <T> {  //사과랑 오렌지 함께 담을 박스
	private T obj;

	public T getobj() {
		return obj;
	}

	public void setobj(T obj) {
		this.obj = obj;
	}
	
}


	


public class FruitAndBox {

	public static void main(String[] args) {
		
		Box<Apple> aBox = new Box<Apple>();   // 사과
		Box<Orange> oBox = new Box<Orange>();   // 오렌지
		
//		aBox.setobj(new Apple());    // 사과 저장
//		oBox.setobj(new Orange());   // 오렌지 저장
//		
//		Apple ap = (Apple)aBox.getobj();  // 꺼내기  //obj랑 Apple랑 타입이 다르기 때문에 (Apple)를 붙여 형변환
//		Orange op = (Orange)aBox.getobj();  // 꺼내기  //obj랑 Orange랑 타입이 다르기 때문에 (Orange)를 붙여 형변환
//		
//		System.out.println(ap1);
//		System.out.println(op1);
		
		
		aBox.setobj(new Apple());    // Apple 타입이나 Apple를 상속하고 있는 것들만 가능 , "Apple" 불가능
		oBox.setobj(new Orange());   // 오렌지 저장 //Orange 타입이나 Orange를 상속하고 있는 것들만 가능 , "Orange" 불가능
		
		Apple a =aBox.getobj();  // //꺼내서 출력 방법1  //형변환 해주지 않아도 됨.
		Orange o = oBox.getobj();
		System.out.println(a);
		System.out.println(o);
		
		System.out.println(aBox.getobj());  //꺼내서 출력 방법2
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




