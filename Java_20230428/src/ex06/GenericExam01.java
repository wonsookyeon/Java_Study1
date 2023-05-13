package ex06;

// 와일드카드, 상한제한

class A{}

class B extends A {}

class C extends B {}    // A <- B <- C 상속관계

class Box<T> {
	private T ob;
	public T getOb() {
		return ob;
	}
	public void setOb(T ob) {
		this.ob = ob;
	}
}


class Unboxer{
	public static void peekBox(Box<? extends B> box) {  // 상한제한  // B(class)  B포함, B 하위클래스만 가능 (B or B 가 상속한 것들)
		System.out.println(box.getOb());
	}
}

public class GenericExam01{
	
	public static void main(String[] args) {
		
		Box<A> aBox = new Box<>();  // 상한제한 -  B포함, B 하위클래스만 가능
		Box<B> bBox = new Box<>();
		Box<C> cBox = new Box<>();
	
//		Unboxer.peekBox(aBox);  //// 상한제한 -  B포함, B 하위클래스만 가능
		Unboxer.peekBox(bBox);
		Unboxer.peekBox(cBox);
		
		
	}
	
}
	


