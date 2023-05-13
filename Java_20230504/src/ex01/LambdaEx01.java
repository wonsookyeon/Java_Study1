package ex01;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

//람다식

@FunctionalInterface   //생략가능하지만 안정성을위해 붙여준다. 메서드 1개라는 표시, 람다식 사용
interface Aaa{
	int max(int a, int b);
}
interface Bbb{
	void printVar (String name, int age);
}

interface Ccc{
	int square(int x);
}

interface Ddd{
	int roll();
}

interface Eee{
	int sumArr(int[]arr);
}


public class LambdaEx01 {

	public static void main(String[] args) {
		
//		1.
		Aaa aa = (a,b) -> a>b? a:b;
		System.out.println(aa.max(10, 5));
		
		// BiFunction -> apply()사용해서 반환해준다
		// 인자값 2개, 정수형태
		BiFunction<Integer, Integer, Integer> bi = (a, b) -> a>b? a:b;
				  // 매개변수, 매개변수, 반환타입
		System.out.println(bi.apply(20, 10));
		
		// 인자값 2개, 매개변수 문자열,정수 / 반환타입 문자열
				  //매개변수, 매개변수, 반환타입
		BiFunction<String, Integer,String> bi1 =
				(name, age) -> "이름은 " + name + " 이고, 나이는 " + age + " 입니다.";
				System.out.println( bi1.apply("홍길동", 20) );
		
				System.out.println("---------------------------------------");
				
//		2. ------------------------------------------------------------		
		Bbb bb = (name, age)-> System.out.println(name + "=" + age);
		bb.printVar("kim", 20);
		
		// 2개의 매개변수, 반환값 없음
		BiConsumer<String, Integer> bi2 = (name,age) -> System.out.println(name + "=" + age);
		bi2.accept("로이", 23);
		
		System.out.println("---------------------------------------");
		
//		3. ------------------------------------------------------------
		Ccc cc = x -> x*x;
		System.out.println(cc.square(10));
		
		// 1개의 매개변수, 반환값 있음
		Function<Integer, Integer> bi3 = x -> x*x;
		        // 매개변수, 반환값
		System.out.println( bi3.apply(3) );
		
		System.out.println("---------------------------------------");
	
		
//		4. ------------------------------------------------------------
		Ddd dd = () -> (int)(Math.random()*6);  // 0~5까지 숫자 랜덤
		System.out.println(dd.roll());
		
//		매개변수 없고 반환값만 있음
//		Supplier<Integer> bi4 = () -> (int)(Math.random()*6);
//		System.out.println( bi4.get() );
		
		Supplier<Integer> bi4 = () -> (int)(Math.random()*6);
		System.out.println(bi4.get());
		
		System.out.println("---------------------------------------");
		
//		5. ------------------------------------------------------------
		Eee ee = (int[]arr)->{
			int sum =0;
			for(int i : arr)
				sum += i;
			return sum;
		};
		
		int[]arr= {1,2,3,4};
		System.out.println(ee.sumArr(arr));
		
		
		// 1개의 매개변수, 반환값 있음
		Function<int[], Integer> bi5 = 
				(int[]arr2)-> {
					int sum =0;
					for(int i : arr2)
						sum += i;
					return sum;
					};
					
		int[]arr2= {1,2,3};
		System.out.println( bi5.apply(arr2) );
		
		

	}

}
