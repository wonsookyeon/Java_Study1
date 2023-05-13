package ex03;

interface MyFunction{
	int max(int a, int b);  //추상메서드
}

class MyMax implements MyFunction{   //interface 구현

	@Override
	public int max(int a, int b) {
		return a>b? a:b;
	}
	
}

public class LambdaEx01 {

	public static void main(String[] args) {
		
		MyFunction m = new MyMax();
		int num = m.max(10, 20);
		System.out.println(num);

	}

}
