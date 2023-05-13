package ch11;
//자바의 정석 634p

import java.util.*;

class Person2{
	String name;
	int age;
	
	Person2(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person2) {
			Person2 tmp = (Person2)obj;
			return name.equals(tmp.name) && age == tmp.age;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return (name+age).hashCode();
	}
	
	@Override
	public String toString() {
		return name + " : " + age;
	}
}

public class HashSetEx4 {

	public static void main(String[] args) {
		
		HashSet set2 = new HashSet();
		
		set2.add(new String("abc"));
		set2.add(new String("abc"));
		set2.add(new Person2("David", 10));
		set2.add(new Person2("David", 10));

		System.out.println(set2);
	}

}
