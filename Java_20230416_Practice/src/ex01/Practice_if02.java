package ex01;


// 중첩 if else 조건문 사용하기
public class Practice_if02 {

	public static void main(String[] args) {

		// 1. 변수 선언
				int kor=70, eng=70, math=60;
				int total_score;
				total_score = kor+eng+math;
		
		// 중첩 if else 조건문 사용하기
		if(total_score >=270) {  //괄호를 없애면 17번 줄로 인해 에러가 난다.
			System.out.println("당신의 토탈 점수는 " + total_score + "입니다.");
			System.out.println("축하해요~");
		}
		else if(total_score>=270)
			System.out.println("당신의 토탈점수는 " + total_score + "입니다. 잘했어요");
		else if(total_score>=210)
			System.out.println("당신의 토탈점수는 " + total_score + "입니다.노력하세요");
		else
			if(math>=60)
				System.out.printf("당신의 토탈점수는 %d점이고, 수학점수는 %d점입니다. 수학이 60점 이상이므로 재수강 대상자는 아닙니다.", total_score, math);
			else
				System.out.println("당신의 토탈점수는 " + total_score + "입니다.재수강 대상자입니다.");
	}


}
