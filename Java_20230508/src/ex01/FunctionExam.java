package ex01;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionExam {

	public static void main(String[] args) {
		
		BiFunction<Integer, Integer, Integer> f = (a,b) -> a>b? a:b;
		System.out.println(f.apply(10, 50));
	
//		int num = f.apply(10, 50);
//		System.out.println(num);
		
		Function<Integer, Integer> f2 = n -> n*n*n;
		System.out.println(f2.apply(4));
		
		Predicate<Integer> f3 = n-> n%2 == 0;  //boolean
		System.out.println(f3.test(11));
		
		BiFunction<String, Integer, String> bf = (name,age) -> "이름은 " + name + ", 나이는 " + age + "살 입니다.";
		System.out.println(bf.apply("홍길동", 25));
		
		BiConsumer<String, Integer> bc = (name, age) -> System.out.println("이름은 " + name + ", 나이는 " + age + "살 입니다.");
		bc.accept("강자바", 20);
		
	}
}
