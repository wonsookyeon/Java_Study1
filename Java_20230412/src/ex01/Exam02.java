package ex01;

/* 
 * 조원3명 자바점수를 입력받아서
 * 자바점수 배점은 랜덤함수 이용해서 5~100값이 저장되도록 한다.
 * 조원 총점, 평균을 출력한다.
 */
public class Exam02 {

	public static void main(String[] args) {
		
//		final int MAX =3;  // 상수화 시키면 new int[Max] 로 바꿔줘야 함
		int sum=0; // , max;
		double average=0;
//		max = 3;  // 이 숫자만 고치면 사람 수 수정 가능
		int[] 조1 = new int[3];  // 변수는 숫자가 앞에 올 수 없기 때문에 조1
		
		
		for(int i=0; i<조1.length; i++) {
	                                       		// (int)(Math.random()*50+1)+50;
			조1[i] = (int)(Math.random()*51)+50;  //(int) Math.random() * (최댓값-최소값+1) + 최소값 ★★★
		}
		
		for(int i=0; i<조1.length; i++)
			sum += 조1[i];
		average = sum/3.0;
		
		for(int i=0; i<조1.length; i++)
			System.out.print(조1[i] + ", ");
		
		System.out.println();
		System.out.printf("총점 : " + sum + ", " +"평균 : %.2f", average);
	
		

	}

}
