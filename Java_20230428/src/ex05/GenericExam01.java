package ex05;

// 와일드카드, 상한제한, 하한제한

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
//	public static void peekBox(Box<? extends Number> box) {  // 상한제한  // Number(class,) 아래만 가능 (Number or Number 가 상속한 것들)
	public static void peekBox(Box<? super Integer> box) {  // 하한제한 
		System.out.println(box.getOb());
	}
}

public class GenericExam01{
	
	public static void main(String[] args) {
		
		Box<Integer> iBox = new Box<>();
		iBox.setOb(123);
		
		Box<Double> dBox = new Box<>();
		dBox.setOb(123.124);
		
		Unboxer.peekBox(iBox);
//		Unboxer.peekBox(dBox);
		
		Box<String> sBox = new Box<>();
		sBox.setOb("korea");
//		Unboxer.peekBox(sBox);  // 타입에 제한을 뒀기 때문에 에러;
		
	}
	
}
	


