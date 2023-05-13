package ex01_01;

//object로 받아주기 -> 실수가 발생할 수 있음

class Box {
	private Object ob;
	
	public Object getOb() {
		return ob;
	}
	
	public void setOb(Object ob) {
		this.ob = ob;
	}
}
	
	class Unboxer{
		public static Object openBox(Box box) {
			return box.getOb();
		
	}
}

public class GenericMethodBox {

	public static void main(String[] args) {
		Box box = new Box();
		box.setOb(123);
		
		//Unboxer클래스 openBox를 이용해서 ob를 꺼내서 변수에 담아서 출력해보자.
		
		Integer tmp = (Integer)Unboxer.openBox(box);;
		System.out.println(tmp);
		
		box.setOb(12.5);
		double f = (double)Unboxer.openBox(box);
		
		box.setOb("korea");
		String str = (String)Unboxer.openBox(box);
				
		
				
	}

}
