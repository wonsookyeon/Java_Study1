package ex01;


public class Exam06 {

	public static void main(String[] args) {
		
		int i=0; // i=1;
		int sum=0;
		
		//for(초기; 검사; 증가)
		
		while(i<10) { // i<=10
			i++;      //sum += i;  순서 바꾸어주려면 i=1 으로 바꾸어줘야함.
			sum += i; // i++;
		}
	
		System.out.println("sum : " + sum);
		System.out.println("---------------------");
		
		int k=2;
		int m=1;
		
		while(k<=9) {
			m=1;  //★★★ 꼭 넣어줘야 반복가능
			while(m<=9) {
				System.out.printf("%d x %d = %d\n", k, m, k*m);
				m++;
			}
			k++;
		}
		System.out.println("----------------------------");
//		while(true) {  }  //while 은 (true) 넣어주면 무한반복
		
		i = 5;
		while(i-- != 0) {  // ★★★ 위로 올려줄 수 있지만
			System.out.println(i + " - I can do it");
		}
		
/*		i = 5;
		while(i != 0) {  
			System.out.println(i + " - I can do it");
			i--;   // ★★★ 이 방법이 더 낫다.
		}
*/		
		
	}
}

