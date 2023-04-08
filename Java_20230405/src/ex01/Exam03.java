package ex01;

public class Exam03 {

	public static void main(String[] args) {
		
		int num = 10;
		int sum = 0;
		int tmp = 0;
		
//		num = num+1;
//		num += 1;  // 1을 더함
		
//		num = num-1;
//		num -= 1;  // 1을 뺌
		
		
//		num++;  // 값이 1씩 증가
//		++num;  // 값이 1씩 증가
	
		tmp = --num;  // 부호가 앞에 있으면 먼저 계산하고 tmp에 넣기
		sum = num--; // 부호가 뒤에 있으면 sum에 넣고 나중에 계산한 값이 num값
		

		System.out.println("tmp : " + tmp); // 9
		System.out.println("num : " + num); // 8
		System.out.println("sum : " + sum); // 9
		
	

	}

}
