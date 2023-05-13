package ex09;

//인터페이스
public interface Calculable {
//	void calculate(int x);  //추상메서드
                  // 값이 1개일 때
	
	int calculate(int x);  // 정수형 반환
}







class Test implements Calculable{

	@Override
	public int calculate(int x) {
		// TODO Auto-generated method stub
		return x*x*x;
	}
	
}




