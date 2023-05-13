package ex01;

import java.util.*;


class Member{
	String name;
	int age;
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class Arraylist01 {

	public static void main(String[] args) {
		
//		int[] num = new int[5];  // 배열은 크기를 정해놓지만
//		num[0] = 정수형;
		
		ArrayList <Integer> list1 = new ArrayList<Integer>();  // 리스트는 크기를 정하지않는다.
		
		list1.add(10);
		list1.add(30);
		list1.add(50); 
		list1.add(40); 
		list1.add(20); 
		
		System.out.println("size : " + list1.size());
		for(int i=0; i<list1.size(); i++)
			System.out.println(list1.get(i));
		
		System.out.println("-------------");
		Collections.sort(list1);   // sort : 지정된 정렬기준으로 정렬해준다.
		for(int i=0; i<list1.size(); i++)
			System.out.println(list1.get(i));
		
		
	}

}
