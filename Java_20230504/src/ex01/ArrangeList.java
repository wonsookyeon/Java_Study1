package ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class ArrangeList {

	public static void main(String[] args) {
		
		List<Integer> is = Arrays.asList(1,3,5,7,9);
		
//		is.add(10); // 수정 불가능  ↓ 이렇게 해줘야됨
		
		is = new ArrayList<>(is);
		is.add(10);
		System.out.println(is);
		
		
//		void accept(List<Integer>) {
//			Collections.reverse(t)
//		}                                
		
//		Consumer<List<Integer>> c = t -> Collections.reverse(t);
		Consumer<List<Integer>> c = Collections::reverse;   //이렇게 더 줄일 수 있음
		                              //클래스명::메서드
		c.accept(is);
		System.out.println(is);

	}

}
