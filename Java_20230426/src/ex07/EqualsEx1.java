package ex07;

class Value{
	int value;
	String name;
	public Value(String name,int value) {
		this.name = name;
		this.value = value;
	}
	
	
	@Override
	public String toString() {
		return "[name : " + name + ", value : " + value + "]";
	}
	
	
	@Override
	public boolean equals(Object obj) {
		                        //v2의 주소값
		
		if(this.value == ((Value)obj).value) //obj가 Value보다 상위클래스이므로 접근불가능이므로 접근해주기 위해 형변환 해준다.
		   //v1의 값(10)  ==  //v2의 주소값의 값(10)
			return true;
		else
			return false;
		
		
//		Value m = (Value)obj;  //obj가 Value보다 상위클래스이므로 접근불가능이므로 접근해주기 위해 형변환 해준다.
//		if(this.value == m.value)
//			return true;
//		else
//			return false;
		
		
//		return this.value == ((Value)obj).value ? true : false;  //삼항연산자
		
	}
}

public class EqualsEx1 {

	public static void main(String[] args) {

		Value v1 = new Value("kim",10);
		Value v2 = new Value("park",10);
		
		System.out.println(v1 == v2);  //주소값 비교라서 false
		System.out.println(v1.equals(v2));    //오버라이딩 안해주면 false 나옴  (18줄)
		
		System.out.println("--------------------");
		
		System.out.println(v1.toString());  //v1의 주소값
		System.out.println(v2);  //v2의 주소값 
		                           //toString 오버라이딩 재정의 해주면 값이 나옴(12줄)
		
	}
}
