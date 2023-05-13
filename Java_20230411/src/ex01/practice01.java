package ex01;

import java.util.Scanner;

/*
 * 1. 몇개의 숫자를 받을지 물어보는 코드를 작성하고,
 * 2. 숫자를 받아서 짝수의 값만 합해서 나오는 코드를 작성하시오.
 * 3. 소수점이나 문자를 받으면 다시 쓰라고 해야하며 일을 끝내야 함.
 */
public class practice01 {

	public static void main(String[] args) {
		
		int count=0;
		int sum=0;
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("몇개의 숫자를 입력하시겠습니까?");
		num = sc.nextInt();
		
		while (count < num) {
			System.out.printf("%d번째 숫자를 입력하세요." , count+1);
			
			if (sc.hasNextInt()) {
				int number = sc.nextInt();
				if (number % 2 == 0) {
					sum += number;
				}
				count++;
			}else if(sc.hasNextDouble()) {
				sc.next();
				System.out.println("실수는 입력 불가입니다. 다시 입력하세요.");
			}
			else {
				sc.nextInt();
				System.out.println("문자는 입력 불가입니다. 다시 입력하세요.");
			}

		}

		System.out.println("짝수의 합 : " + sum);

	}

}
