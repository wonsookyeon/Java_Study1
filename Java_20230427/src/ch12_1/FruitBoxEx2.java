package ch12_1;

import java.util.ArrayList;

//자바의 신 677p


interface Eatable{}

class Fruit implements Eatable{
	public String toSting() { return "Fruit";}
}

class Apple extends Fruit { public String toSting() { return "Apple";}}

class Grape extends Fruit { public String toSting() { return "Grape";}}

class Toy { public String toSting() { return "Toy";}}



public class FruitBoxEx2 {

	public static void main(String[] args) {
		
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		FruitBox<Grape> grapeBox = new FruitBox<Grape>();
//		FruitBox<Grape> grapeBox = new FruitBox<Apple>(); //에러
//		FruitBox<Toy> toyBox = new FruitBox<Toy>(); //에러
		
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		appleBox.add(new Apple());
//		appleBox.add(new Grape());
		grapeBox.add(new Grape());
		
		System.out.println("fruitBox-" + fruitBox);
		System.out.println("appleBox-" + appleBox);
		System.out.println("grapeBox-" + grapeBox);

	}

}

class FruitBox<T extends Fruit & Eatable> extends Box<T>{}

class Box<T>{
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) { list.add(item); }
	T get(int i) { return list.get(i); }
	int size() { return list.size(); }
	public String toString() { return list.toString(); }
	}
	





