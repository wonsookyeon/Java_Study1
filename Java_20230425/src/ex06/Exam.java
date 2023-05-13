package ex06;

public class Exam {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		car.run1(); //1
		car.run2();
		car.run3(new Tire() { 
			public void roll() {   // 일회성
				System.out.println("익명 자식 Tire 객체3이 굴러감");
			}
		});
	}
}



