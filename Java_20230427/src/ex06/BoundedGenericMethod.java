package ex06;


class Box<T>{
	private T ob;
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}

class BoxFactory{                                // T에는 아무거나 들어올수있지만 <T extends Number> 를 써줘서 제한을 둠.
	public static <T extends Number> Box<T> makeBox(T o){  //제네릭
		                     // 제한, (Class)Number나 Number가 상속한 것들만 올 수 있다. 대표적으로 integer나 double, 문자는 안됨.
		Box<T> box = new Box<T>();
		box.set(o);
		
		System.out.println("Boxed Data : " + o.intValue()); // double실수가 들어가면 int로 변환되어 정수만 나옴
		                                       //o가 Number가 상속하고있는것들이 integer정수, double실수 이므로 쓸 수 있다.
		return box;
	}
}

class Unboxer{
	public static <T extends Number> T openBox(Box<T> box){  //제네릭
		System.out.println("Unboxed Data : " + box.get().intValue());
		return box.get();  // ob값 반환
	}
}



public class BoundedGenericMethod {

	public static void main(String[] args) {
		
		Box<Integer> sBox = BoxFactory.makeBox(new Integer(7));
		int n = Unboxer.openBox(sBox);
		System.out.println("n : " + n);

	}

}
