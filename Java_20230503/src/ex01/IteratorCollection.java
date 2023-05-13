package ex01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorCollection {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(); // Ctrl+shift+o -> import 나타남
		
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		list.add("Box");
		
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()) {   // hasNext : 다음 데이터가 있으면
			String st = it.next();  // st 에 입력
			System.out.println(st);  // st 출력
		}
		
		System.out.println("----------");
		
		it = list.iterator();
		while(it.hasNext()) {
			String st = it.next();
			if(st.equals("Box"))   // Box 만 삭제하고 싶을때
				it.remove();
			
		}
		System.out.println("----------");
		
		it = list.iterator();
		while(it.hasNext()) {
//			String st = it.next();  // st 생성안하고 출력하려면 ↓
			System.out.println(it.next()); 
		}
		
		
//		for(String str : list)
//			System.out.println(str);
		

	}

}
