package ex01;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

// Stream

class ReportCard{
	private int kor;
	private int eng;
	private int math;
	public ReportCard(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	
}

public class MyFirstStream3 {

	public static void main(String[] args) {
		
		ReportCard[] cards = {
				new ReportCard(70,80,90),
				new ReportCard(79,80,70),
				new ReportCard(70,70,70),
				new ReportCard(90,90,100),
		};
		
//		double average = Arrays.stream(cards)
//				.flatMapToInt(r->IntStream.of(r.getKor(),r.getEng(),r.getMath()))
//				.average().getAsDouble();
		
		IntStream s1 = Arrays.stream(cards)
				.flatMapToInt(r->IntStream.of(r.getKor(),r.getEng(),r.getMath()));
		
		double average = s1.average().getAsDouble();
		
		System.out.println("average : " + average);
		
		// 이차원 배열을 1차원 배열로 변환해서 출력
		int[][] array = {{10,20},{30,40},{50,60}};
		
//		int[] array2 = {10,20,30,40,50,60};
		Arrays.stream(array).flatMapToInt(t->Arrays.stream(t)).forEach(s->System.out.println(s));
		
	}
		
	

}
