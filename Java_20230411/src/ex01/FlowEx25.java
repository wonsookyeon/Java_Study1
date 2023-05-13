package ex01;

import java.util.Scanner;

//Java의 정석 170p
public class FlowEx25 {

	public static void main(String[] args) {
		
		int num=0;
		int sum = 0;
		
		System.out.println("숫자를 입력하세요.(예:12345)>");
		
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine(); // 입력받은 내용을 tmp에 저장
		num = Integer.parseInt(tmp);  //입력받은 문자열(tmp)을 숫자로 형변환하여 num에 저장
		
		while(num!=0) {
			sum += num%10; // sum = sum + (num%10)
			               //num을 10으로 나눈 나머지를 sum에 더함
			System.out.printf("sum=%3d num=%d%n", sum, num);
			
			num /= 10;  //num=num/10;  num을 10으로 나눈 값을 다시 num에 저장
		}
		
		System.out.println("각 자리수의 합 : " + sum);

	}

}
