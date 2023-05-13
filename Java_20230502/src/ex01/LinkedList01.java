package ex01;

import java.util.*;

public class LinkedList01 {

	public static void main(String[] args) {
		
//		LinkedList<Integer> lists = new LinkedList<>();
		ArrayList<Integer> lists = new ArrayList();
		
		lists.add(10);
		lists.add(20);
		lists.add(30);
		
//		int num = lists.peek();  // 첫번째 요소를 반환
//		int num = lists.poll();  // 첫번째 요소를 제거
//		int num = lists.remove();  // 첫번째 요소를 제거
		int num = lists.remove(0);  // 첫번째 요소를 제거 // ArrayList 는 인덱스 번호가 필요함
		
		
		System.out.println(num);
		System.out.println(lists);

	}

}
