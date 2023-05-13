package ex02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person implements Comparable<Person> {  //implements Comparable<Person>
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return name + ", " + age;
	}
	
	@Override
	public int compareTo(Person p) {
		return this.age - p.age;  // this 랑 p랑 바꾸면 나이많은-적은 순으로 바뀜
	}
}

class PersonComparator implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		return o1.age - o2.age;
	}
	
}

public class ComparatorPerson {

	public static void main(String[] args) {
		
		List<Person> list = new ArrayList<>();
//		TreeSet<Person> list = new TreeSet<>();
		list.add(new Person("kim", 26));
		list.add(new Person("park", 21));
		list.add(new Person("yoon", 35));
		list.add(new Person("lee", 32));
		
		
//		Collections.sort(list); // 기본자료형만 가능
		
		Collections.sort(list, new Comparator<Person>(){
			@Override
			public int compare(Person o1, Person o2) {
				return o1.age - o2.age;
			}
		});
		
		//람다식
//		Collections.sort(list, (o1,o2) -> o1.age - o2.age);
//		Collections.sort(list, (o1,o2) -> o1.name.length() - o2.name.length());
		
		//Collections.sort(list, new PersonComparator());
		
		for(Person p : list)
			System.out.println(p);
		
		System.out.println("---------------------");
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(11);
		list2.add(55);
		list2.add(8);
		list2.add(99);
		list2.add(1);
		
		Collections.sort(list2);
		for(int p : list2)
			System.out.println(p);
		

	}

}
