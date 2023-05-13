package ex01;


//1~100 까지 2의 배수이면서 3의 배수인 숫자 나열
public class ForExam01 {

	public static void main(String[] args) {

		int count = 0;
		
		for(int i=1; i<=100; i++) {
			if (i % 2 == 0 && i % 3 ==0) {
				System.out.print(i + ", ");  //println 으로 하면 밑으로 나열
				count ++; //if문장 참일때 카운트 갯수 플러스
			}
		}
		
		System.out.println("\n1~100 에서 2와 3의 배수 갯수는 : " + count);

		
	}

}
