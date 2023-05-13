package ex01;

/* 
 * 조원3명 자바점수를 입력받아서
 * 자바점수 배점은 랜덤함수 이용해서 5~100값이 저장되도록 한다.
 * 조원 총점, 평균을 출력한다.
 */
public class Exam01 {

	public static void main(String[] args) {
		
		int sum=0;
		int yj, ye, sy;
		double average=0;
		
		                                    // (int)(Math.random()*50+1)+50;
		yj  = (int)(Math.random()*51)+50;   //(int) Math.random() * (최댓값-최소값+1) + 최소값 ★★★
		System.out.println("yj의 점수 : " + yj);
		
		ye  = (int)(Math.random()*51)+50;
		System.out.println("ye의 점수 : " + ye);
		
		sy  = (int)(Math.random()*51)+50;
		System.out.println("sy의 점수 : " + sy);
		
		
		sum= yj+ye+sy;
		average = sum/3.0;
		
	
		System.out.println("총점 : " + sum);
		System.out.printf("평균 : %.2f" , average );
		

	}

}
