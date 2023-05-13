package ex01;

class Card{
	void info() {
		System.out.println("card()");
	}
}


public class Exam01 {

	public static void main(String[] args) throws ClassNotFoundException {
		
//		Card card = new Card();
//		card.info();
		
//		Class cObj = new Card().getClass();
//		Class cObj = Card.class; 
//		Class cObj = Class.forName("ex01.card"); // 던지기
//		Object obj = Class.forName("ex01.Card");
		
		String str = "kor";
		System.out.println(str);
		
		//char[] : 나누어져있는 글자들을 합쳐서 문자열을 만듬
		char[] c = {'H','e','l','l','o'};
		String s= new String(c);
		System.out.println(s);
		
		
		
		
		
		System.out.println("---------------------------------------");
		
		
		str = "koreakor";
		System.out.println(str);
		
		String msg = str.replace("kor", "engg");  //str은 변경 불가능하기때문에 새로운 변수명을 사용해서 해줘야 함.
		System.out.println(str);
		System.out.println(msg);
		
		
		//String[] split : 문자열을 나누어 문자배열에 담아 반환
		String study = "kor,eng,math";
		String[] aaa = study.split(",");
		for(String a : aaa)
			System.out.println(a);
		
//		Object obj = 10;  // 주소값이 아니라 ↓
//				//객체 주소값을 넣어야함
//		Object obj2 = new Integer(10); // 이렇게 만들어줌
		
		String ss = "10";
		Object obj = Integer.parseInt(ss);
		Object obj2 = Integer.valueOf(ss);
		
		
		int i = 5;
		Integer iObj =  new Integer(7); // 이렇게 하면 ↓↓
		
		int sum = i + iObj;  // 컴파일하면 내부적으로 iObj.intValue(); 로 바꿔주기때문에가능하다.
		System.out.println(sum);
		

	}

}
