package ex05;

class Member{
	
	//1. 함수이름 같음, 2. 매개변수 타입이나 갯수가 달라야한다.
	int func(int n) {
		System.out.println("int");
		return n;
	}
	double func(double d) {
		System.out.println("double");
		return d;
	}
	String func(String str) {
		System.out.println("str");
		return str;
	}
	
	int func(int n1, int n2) {
		System.out.println("int int");
		return n1+n2;
	}
}

public class Exam01 {

	public static void main(String[] args) {
		Member m = new Member();
		System.out.println(m.func(10,2));  //위로 올라가서 알맞은것을 찾아서 실행 후 내려와서 출력
		
	}

}
