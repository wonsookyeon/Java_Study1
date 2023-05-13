package ex01;

// Stream

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MyFirstStream {

	public static void main(String[] args) {
		
		int[] ar = {1,2,2,3,4,4,5,5,6}; //배열
		
		// 배열의 짝수 합을 구함, 단 중복제거
		
//		int sum = 0;
//		for(int a : ar) {
//			if( a%2 == 0)
//				sum += a;
//		}
//		
//		System.out.println(sum);
		
		IntStream stm1 = Arrays.stream(ar);  // 배열 ar로부터 스트림 생성
		int total = stm1.distinct().filter(n -> n%2 ==0).sum(); 
		                  //중복제거     //짝수만 걸러내기      //합계
		System.out.println("total : " + total);
		
		//배열에서 중복제거 후 홀수 갯수는 몇개인가?
		stm1 = Arrays.stream(ar);
		Long total2 = stm1.distinct().filter(n ->n%2 ==1).count();
                           //중복제거     //홀수만 걸러내기      //갯수세기
//		int total2 = (int) stm1.distinct().filter(n ->n%2 ==1).count();
		System.out.println("홀수의 갯수 : " + total2);
		
		
		
		
		String[] names = {"kim", "park", "hong", "Lee", "kor", "eng", "math"};
		
		//1. 이름출력
		Stream<String> stm2 = Arrays.stream(names);
		stm2.forEach(str->System.out.println(str));
		
		System.out.println("------------------------------");
		
		//2. 첫글자가 k만 출력
		stm2 = Arrays.stream(names);
		stm2.filter(name->name.startsWith("k")).forEach(str->System.out.println(str));
		
		System.out.println("------------------------------");
		
		//3. 글자수가 4자 이상만 출력
		stm2 = Arrays.stream(names);
		stm2.filter(name->name.length()>=4).forEach(str->System.out.println(str));
		
		System.out.println("------------------------------");

		
		List<String> list = Arrays.asList("Toy", "Box", "Robot");
		
		//1. 리스트를 스트림으로 변환 후 출력
		Stream<String> s= list.stream();  // Ctrl + 2 + L
		s.sorted().forEach(n-> System.out.println(n));  //sorted 를 쓰면 정렬, 순서x
		
		System.out.println("------------------------------");
		
		//2. 리스트를 스트림으로 변환 후 글자 갯수합을 출력
		s= list.stream();
		long count2 = s.map(n->n.length()).count();  // 글자 갯수 (3,3,5)의 갯수(3)
		System.out.println("단어 갯수 : " + count2);
		
		System.out.println("------------------------------");
		
		s= list.stream();
		int sum2 = s.mapToInt(n-> n.length()).sum();  // 글자 갯수(3,3,5)의 합(11)
		           //스트림 요소 변환
		System.out.println("글자수 합 : " + sum2);
	
		System.out.println("------------------------------");
		
		System.out.println("글자의 갯수 : " + apply("korea"));
		
		boolean t = test(11);    
		System.out.println(t);
	}


		static int apply(String s2) {  // 83줄 실행
			return s2.length();
		}
	
		
		static boolean test(int n) {  // 85, 86줄 실행
		return n%2 == 0;
		}
		
	

}
