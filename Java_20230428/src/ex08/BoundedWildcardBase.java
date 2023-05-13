package ex08;

// extends -> get 기능, 하위클래스만 가능
// super -> set 기능, 상위클래스만 가능

class Box<T> {
	private T ob;
	public T getOb() {
		return ob;
	}
	public void setOb(T ob) {
		this.ob = ob;
	}
}

class Toy{
	@Override
	public String toString() {
		return "I am a Toy()";
	}
}

class BoxHandler{
	
	//outBox 용도는 get기능 역할만 담당
	public static void outBox(Box<? extends Toy> box) {
		Toy toy = box.getOb();  //꺼내는 getter 기능  // ctr + 2 + L 하면 우항을 만들어준다.
//		box.setOb(new Toy());  // 위에서 extends를 넣어서 하위클래스만 가능하도록 제한을 두었는데
		                        //set을 쓰면 Toy가 아닌 상위클래스를 사용할 가능성이 있기에 에러로 사용하지 못하게 막음
		System.out.println(toy);
	}
	//setter 기능만 담당
	public static void inBox(Box<Toy> box, Toy n) {
		box.setOb(n);  //넣는 setter 기능
	}
}


public class BoundedWildcardBase {

	public static void main(String[] args) {
		
		Box<Toy> box = new Box<>();
		
		BoxHandler.inBox(box, new Toy());
		BoxHandler.outBox(box);
		

	}

}
