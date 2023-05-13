package ex04;

class A{}
class B extends A{}
class C extends A{}

class Box<T extends A> {
	private T ob;
	
	public T getOb() {
		return ob;
	}
	
	public void setOb(T ob) {
		this.ob = ob;
	}
}

class Unboxer{
	
		public static <T extends A> T openBox(Box<T> box) { // generic 메소드라는걸 알려주는 표시<>를 해준다.
			return box.getOb();
		
	}
}

public class GenericMethodBox {

	public static void main(String[] args) {
		
		Box<C> cBox = new Box<C>();
		Box<B> bBox = new Box<B>();
		Box<A> aBox = new Box<A>();
//		Box<A> aaBox = new Box<B>(); // error; // 상속받아서 가능하다고 생각할 수 있으나 타입이 일치하지 않기때문에 에러
		
				
	}

}
