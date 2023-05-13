package ch12;

import java.util.ArrayList;

// 자바의 신 675p

class Fruit {
	public String toString() { return "Fruit"; }
}

class Apple extends Fruit{
	public String toString() { return "Apple"; }
}

class Grape extends Fruit{
	public String toString() { return "Grape"; }
}

class Toy {
	public String toString() { return "Toy"; }
}



class Box<T>{
	ArrayList<T> list = new ArrayList<T>();
	
	void add(T item) { list.add(item); }  // Fruit
	
	T get(int i) { return list.get(i); }
	
	int size() { return list.size(); }
	
	public String toString() { return list.toString(); }
}

public class FruitBoxEx1 {

	public static void main(String[] args) {
		
		Box<Fruit> fruitBox = new Box<Fruit>();
		Box<Apple> appleBox = new Box<Apple>();
		Box<Toy> toyBox = new Box<Toy>();
//		Box<Grape> grapeBox = new Box(Apple)(); // 에러. 타입 불일치
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple()); //Ok. void add(Fruit item)
		fruitBox.add(new Grape());
//		fruitBox.add(new Toy());  // 에러, Toy 는 상속받지 않았기 때문에.
		
		
		appleBox.add(new Apple());
//		appleBox.add(new Grape()); //
//		appleBox.add(new Toy()); // 에러. Box<Apple>에는 Apple만 담을 수 있음
		
		
		toyBox.add(new Toy());
//		toyBox.add(new Apple()); // 에러. Box<Toy> 에는 Apple을 담을 수 없음
		
		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(toyBox);
		
		

	}

}
