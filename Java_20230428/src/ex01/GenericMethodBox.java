package ex01;


class Box { //실수도 넣을 수 있게 만들고 싶으면 double박스클래스를 하나 더 만들어주면 된다. 또는 object 받아준다.
	private Integer ob;
	
	public Integer getOb() {
		return ob;
	}
	
	public void setOb(Integer ob) {
		this.ob = ob;
	}
}
	
	class Unboxer{
		public static Integer openBox(Box box) {
			return box.getOb();
		
	}
}

public class GenericMethodBox {

	public static void main(String[] args) {
		Box box = new Box();
		box.setOb(123);
		
		//Unboxer클래스 openBox를 이용해서 ob를 꺼내서 변수에 담아서 출력해보자.
		
		Integer tmp = Unboxer.openBox(box).intValue();
		//int num = tmp.intValue();
		System.out.println(tmp);
				
	}

}
