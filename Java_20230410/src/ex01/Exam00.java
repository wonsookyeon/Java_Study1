package ex01;

public class Exam00 {

	public static void main(String[] args) {
		
		int total = 0;
		for(int i=1; ; i++) {
			if(i%2==0)
				total +=i;
				else
					total -=i;
			if(total>100) break;  // break를 써주지않으면 for문만 무한반복이므로 출력되지 않음
		}
		
		System.out.println(total);
	}

}
