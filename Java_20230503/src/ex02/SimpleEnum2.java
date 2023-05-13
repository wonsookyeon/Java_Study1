package ex02;


enum Animal{
	DOG, CAT
}

enum Person2{
	MAN,WOMAN
}

public class SimpleEnum2 {

	public static void main(String[] args) {
		
		who(Person2.MAN);
//		who(Person2.MAN.ordinal());  // 이렇게 하면 안됨.
//		who(Animal.CAT);  // 에러
		

	}
	
	public static void who(Person2 p) {
		switch(p) {
		case MAN :
			System.out.println("남성");
			break;
		case WOMAN :
			System.out.println("여성");
			break;
		}
	}

}
