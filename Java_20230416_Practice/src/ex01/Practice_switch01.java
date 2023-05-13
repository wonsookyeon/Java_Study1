package ex01;


// switch -> 사용자가 자신의 연령대를 입력하면 해당 연령대에 맞는 책 추천
/* 
 * 변수조건은 정수형이어야 한다. byte, short, int 그러나 long 타입은 x, char타입은 o
 * break, default 빼먹지 않도록 주의★
 */
public class Practice_switch01 {

	public static void main(String[] args) {
		
		// 1. 변수 선언
		int age = 17;
		
		//2. 사용자 입력 예외처리
		if(age>10 && age<20) { // 11~19
			age=10; // 이렇게 해주면 switch문 case 1 의 조건으로 실행된다.
			//System.out.println("10이라고 다시 연령대를 입력해주세요. 프로그램을 종료합니다.");
			//System.exit(0); // 이걸 써주지 않으면 밑에 default 문장까지 실행된다.
		}
		else if(age>20 && age<30) { // 21~29
			System.out.println("20이라고 다시 연령대를 입력해주세요. 프로그램을 종료합니다.");
			System.exit(0); 
		}
		else if(age>30 && age<40) { // 31~39
			System.out.println("30이라고 다시 연령대를 입력해주세요. 프로그램을 종료합니다.");
			System.exit(0); 
		}
		else if(age>40 && age<50) { // 41~49
			System.out.println("40이라고 다시 연령대를 입력해주세요. 프로그램을 종료합니다.");
			System.exit(0); 
		}
		else if(age>50 && age<60) { // 51~59
			System.out.println("50이라고 다시 연령대를 입력해주세요. 프로그램을 종료합니다.");
			System.exit(0); 
		}
		else {
			if(age<10) {
				System.out.println("최소 10이상만 입력해주세요. 프로그램을 종료합니다.");
				System.exit(0);
			}
		}
		
		// 3. switch  조건문
		// 변수조건은 정수형이어야 한다. byte, short, int 그러나 long 타입은 x, char타입은 o
		//break, default 빼먹지 않도록 주의★
		switch(age) {
		case 10 : 
			System.out.println(age + "대 입니다. 참고서 코너는 A 구역입니다.");
			break;
			//------------------------
		case 20 : 
			System.out.println(age + "대 입니다. 취업서적 코너는 B 구역입니다.");
			break;
			//------------------------
		case 30 : 
			System.out.println(age + "대 입니다. 자기계발 코너는 C 구역입니다.");
			break;
			//------------------------
		case 40 : 
			System.out.println(age + "대 입니다. 재테크 코너는 D 구역입니다.");
			break;
			//------------------------
		case 50 : 
			System.out.println(age + "대 입니다. 재취업 코너는 E 구역입니다.");
			break;
		default:
			System.out.println("60대 이상 입니다. 건강/장수 코너는 F 구엽입니다.");
			break;
		}
		
	
	}


}
