package ch11;
//자바의 정석 605p

import java.util.*;

public class StackQueueEx {

	public static void main(String[] args) {
		Stack st = new Stack();
		Queue q = new LinkedList();  //Queue 인터페이스의 구현체인 LinkedList 사용
		
		st.push(2);
		st.push(1);
		st.push(0);
		
		q.offer(0);
		q.offer(1);
		q.offer(2);
		
		System.out.println(" = Stack = ");
		while(!st.empty()) {
			System.out.println(st.pop());
		}
		
		System.out.println(" = Queue = ");
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
			
			
		
		

	}

}
