package ex01;

public class Exam03 {

	public static void main(String[] args) {
		// Run - Run Configurations - Arguments 에서 값 지정
		
//		if(args[0].equals("//Arguments에서 지정한 값"))
		                   // [1] 이상의 값을 입력하려면 앞의 배열에 허수를 입력해줘야함
//		System.out.println("");
		
		if(args[1].equals("eng"))
			System.out.println("-------------");
		else if(args[2].equals("math"))
			System.out.println("++++++++++++");
		else if(args[0].equals("kor"))
			System.out.println("**************");
		

	}

}
