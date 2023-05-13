package ch11;
// 자바의 정석 585p
// ArrayList

import java.util.*;

public class ArrayListEx1 {

	public static void main(String[] args) {   // ArrayList 장단점 찾아보기☆
		ArrayList list1 = new ArrayList(10);  // 배열에 add 를 넣으면 배열하나에 앞은 앞배열의 주소값, 뒤는 뒷배열의 주소값을 저장, 가운데는 본인의 주소값을 저장함.
		                             // 10 넣어도 되고 안넣어도 됨.
		list1.add(5);
		list1.add(4);
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4)); // 1~4번째를 가지고 list2에 넣어라.
		print(list1, list2);
		
		Collections.sort(list1);  // list1과 list2를 정렬한다.  // sort : 정렬
		Collections.sort(list2);  // Collections.sort(List i)
		print(list1, list2);
		
		System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2)); // contains : list1에 list2를 포함하고 있는지 true, false
		
		list2.add("B");
		list2.add("C");
		list2.add(3, "A"); // list2 3번째 위치에 A를 넣어라. // add : 원래 있던 값들은 뒤로 밀림.
		print(list1, list2);
		
		list2.set(3, "AA");  // list2 3번째 위치에 AA를 넣어라.  // set : 원래 있던 값과 교체.
		print(list1, list2);
		
		System.out.println("list1.retainAll(list2) : " + list1.retainAll(list2)); //  retain : list1 에서 list2 와 겹치는 부분만 남기고 나머지는 삭제한다.
		
		print(list1, list2);
		
		for(int i = list2.size()-1; i>=0; i--) {  // list2 에서 list1 에 포함된 객체들을 삭제한다.
		                                          // list2 뒤에서부터 해야되기 때문에 i= list2.size()-1 부터 시작함.
			                                      // 배열리스트는 값이 삭제되면 앞으로 땡겨지기 때문에 뒤에서부터 시작해야함.
			                                      // list2 size는 6이지만 배열의 시작은 1이아닌 0이기때문에 -1 해줌
			if(list1.contains(list2.get(i)))  // list1 에 list2 i번째 숫자가 포함되어 있으면
				list2.remove(i);     // list2 i번째 숫자는 삭제한다.  // remove : 삭제한다.
		}
		print(list1, list2);
	}

	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);
		System.out.println();
	}
	
}
