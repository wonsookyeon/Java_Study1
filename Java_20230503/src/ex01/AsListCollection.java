package ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AsListCollection {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(); // Ctrl+shift+o -> import 나타남
		
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		list.add("Box");
		
		List<String> list2 = Arrays.asList("Toy", "Box", "Robot", "Box");
//		list2.add("bbb");  // 불가 ↓
		List<String> ls = new ArrayList<>(list2);  //참조변수를 통해서 추가할 수 있음. <> 생략가능
		ls.add("bbb");
		
		
		for(String str : ls)
			System.out.println(str);
		

	}

}
