package Practice_Interface;

public class MathMain01 {

	public static void main(String[] args) {
		
		// 인터페이스를 구현한 클래스와 함께쓰는 식
		
		Math mat11 = new 더하기();
		int result1 = mat11.math(1, 5);
		System.out.println(result1);
		
		Math mat22 = new 빼기();
		int result2 = mat22.math(10, 5);
		System.out.println(result2);
		
		Math mat33 = new 곱하기();
		int result3 = mat33.math(1, 5);
		System.out.println(result3);
		
		Math mat44 = new 나누기();
		int result4 = mat44.math(10, 5);
		System.out.println(result4);
		
		System.out.println("---------------------");
//----------------------------------------------------		
		
		//익명객체구현
		Math mat1 = new Math() {
			@Override
			public int math(int x, int y) {
				return x+y;
			}
		};
		System.out.println(mat1.math(1, 5));
		
		
		
		Math mat2 = new Math() {
			@Override
			public int math(int x, int y) {
				return x-y;
			}
		};
		System.out.println(mat2.math(5, 1));
		
		
		
		Math mat3 = new Math() {
			@Override
			public int math(int x, int y) {
				return x*y;
			}
		};
		System.out.println(mat3.math(5, 2));
		
		
		
		Math mat4 = new Math() {
			@Override
			public int math(int x, int y) {
				return x/y;
			}
		};
		System.out.println(mat4.math(10, 5));
		
		
		
		System.out.println("-------------------");
//-----------------------------------------------------------
		
		
		//람다식, 인터페이스 메서드가 1개일때만 가능
		Math mat5 = (x,y) -> (x+y);
		System.out.println(mat5.math(1, 5));
		
		Math mat6 = (x,y) -> (x-y);
		System.out.println(mat6.math(5, 1));
		
		Math mat7 = (x,y) -> (x*y);
		System.out.println(mat7.math(2, 5));
		
		Math mat8 = (x,y) -> (x/y);
		System.out.println(mat8.math(10, 2));
		

	}

}
