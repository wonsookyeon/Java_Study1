package ex02;

import java.util.HashMap;
import java.util.Set;

public class HashMapExam {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(5, "Kim");  // key는 중복 불가, value 값은 중복 가능
		map.put(10, "Park");
		map.put(9, "Lee");
		map.put(10, "Hong");
		map.put(8, "Park");
		map.put(1, "Kim");
		
		
		System.out.println(map);
		System.out.println(map.get(9));
//		map.clear();
//		map.remove(9);  // key값 삭제
		System.out.println(map);
		System.out.println("------------------------");
		
		Set<Integer> set = map.keySet(); // key 반환타입을 set으로 바꿔줄 수 있음
		System.out.println(set);
		
		for(int n : set) {   // set에 있는 값을 하나씩
			System.out.println(n);
		}
		
		
		System.out.println("------------------------");
		for(int n : set) {  // set에 있는 value값을 하나씩
			System.out.println(map.get(n));
		}
		
	}

}
