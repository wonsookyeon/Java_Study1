package ex01;


// if~ else if~ else 조건문 사용하기
public class Practice_if01 {

	public static void main(String[] args) {

		// 1. 변수 선언
		int kor=70, eng=70, math=70;
		int total_score;
		total_score = kor+eng+math;
		
		// 2. if~ else if~ else 조건문 사용하기
		if(total_score >=270) {  //괄호를 없애면 17번 줄로 인해 에러가 난다.
			System.out.println("당신의 토탈 점수는 " + total_score + "입니다.");
			System.out.println("축하해요~");
		}
		else if(total_score>=270)
			System.out.println("당신의 토탈점수는 " + total_score + "입니다. 잘했어요");
		else if(total_score>=210)
			System.out.println("당신의 토탈점수는 " + total_score + "입니다.노력하세요");
		else
			System.out.println("당신의 토탈점수는 " + total_score + "입니다.음......");
	}

}
