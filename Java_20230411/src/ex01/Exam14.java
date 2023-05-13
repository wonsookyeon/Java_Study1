package ex01;

public class Exam14 {

	public static void main(String[] args) {
		
		int sum=0;
		int i=1;
		
		//for(초기; 검사; 증가)
		
		do {             //do 먼저 실행 후
			sum +=i;
			i++;
		} while(i<=10);   // while 조건 확인    do-while 
		
		
		System.out.println(sum);

		                                   // 보통 while 문은 회전횟수 확실하지않을때
		                                   // for 문은 회전횟수 확실할때 (검사문횟수)
	}

}
