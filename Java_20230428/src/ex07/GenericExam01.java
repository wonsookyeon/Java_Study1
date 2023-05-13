package ex07;

// 와일드카드, 하한제한

class A{}

class B extends A {}

class C extends B {}    // A <- B <- C 상속관계

class D extends B {}    // A <- B <- C , B <- D 상속관계

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
	public static void peekBox(Box<? super B> box) {  // 하한제한 // B(class)포함, B 상위클래스만 가능
		System.out.println(box.getOb());
	}
}

public class GenericExam01{
	
	public static void main(String[] args) {
		
		Box<A> aBox = new Box<>(); 
		Box<B> bBox = new Box<>();
		Box<C> cBox = new Box<>();   // 하한제한 - B포함, B 상위클래스만 가능
		Box<D> dBox = new Box<>();
		Box<Object> iBox = new Box<>();
		
	
		Unboxer.peekBox(iBox);
		Unboxer.peekBox(aBox);
		Unboxer.peekBox(bBox);
//		Unboxer.peekBox(cBox);   // 하한제한 - B포함, B 상위클래스만 가능
//		Unboxer.peekBox(dBox);
		
		
	}
	
}
	


