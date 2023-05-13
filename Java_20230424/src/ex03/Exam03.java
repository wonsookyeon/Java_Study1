package ex03;


public class Exam03 {

	public static void main(String[] args) {
		
		Exam04 ex04 = new Exam04(); // 같은 패키지의 class 사용가능
		ex04.sun();
		//ex04.num = 100;
		
//		Study st = new Study(); // 같은 패키지의 class 사용가능
//		st.count = 100;
		System.out.println("-------------------------");

		ex04.setNum(20);
		System.out.println("num : " + ex04.getNum());
		
		System.out.println("-------------------------");
		
		ex04.setName("홍길동");
		System.out.println(ex04.getName());
		
		
	}

}
