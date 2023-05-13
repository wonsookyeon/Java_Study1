package StudentEx01;

import java.util.function.Function;

public class MainExample {
	private static Student[] students= {
			new Student("홍길동", 90,96),
			new Student("신용권", 95,93)
	};
	
	// avg() 메소드 작성
	
//	private static double avg(Function<Student> f) {
	private static double avg(Function<Student, Integer> f) { //자바가 가지고있는 Function쓰기
		int sum = 0;
		for(Student student : students)
			sum += f.apply(student);
		
		return (double)sum/students.length;
	}

	public static void main(String[] args) {

		double englishAvg = avg ( s -> s.getEnglishScore());
		System.out.println("영어 평균 점수 : " + englishAvg);
		
		double mathAvg = avg ( s -> s.getMathScore());
		System.out.println("수학 평균 점수 : " + mathAvg);
		
	}

}
