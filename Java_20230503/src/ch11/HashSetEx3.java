package ch11;
//자바의 정석 634p

import java.util.*;

class Person{
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return name + " : " + age;
	}
}

public class HashSetEx3 {

	public static void main(String[] args) {
		
		HashSet set2 = new HashSet();
		
		set2.add("abc");
		set2.add("abc");
		set2.add(new Person("David", 10));
		set2.add(new Person("David", 10));

		System.out.println(set2);
	}

}
