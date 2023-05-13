package ex02;

//Generic  -> object의 실수를 방지하기 위해 

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
		public static <T> T openBox(Box<T> box) { // generic 메소드라는걸 알려주는 표시를 해준다.
			return box.getOb();
		
	}
}

public class GenericMethodBox {

	public static void main(String[] args) {
		
		Box<Integer> box = new Box<Integer>();  // 실수넣고싶으면 <double> 넣으면되고 문자열넣고싶으면 <String>넣으면 됨
		box.setOb(10);
		Unboxer.openBox(box);

		
		//Box box = new Box();
		//box.setOb("dddd");    // generic 을 써주면 무엇을 넣어도 출력가능하게 해주지만 28줄 방법으로 해야됨
		
		
		System.out.println(box.getOb());
		
				
	}

}
