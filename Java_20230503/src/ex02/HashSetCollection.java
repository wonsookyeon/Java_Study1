package ex02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetCollection {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet();  // HashSet : 순서x, 중복x
		
		set.add(15);
		set.add(2);
		set.add(8);
		set.add(90);
		set.add(2);
		set.add(10);
		
		for(int s : set)
			System.out.println(s);
		
//		Iterator<String> it2 = set.iterator();
//		
//		while(it2.hasNext()) {
//			String st2 = it2.next();
//			System.out.println(st2);
//		}
		
		

	}

}
