package ex07;

class Member{
	private String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	@Override   // m1.equals(m2)
	public boolean equals(Object obj) {
		
		if(this.id == ((Member)obj).id)
			//m1         //Member m1 = (Member)obj;
			             //m1.id -> 가능
			return true;
		return false;
			
	}
}


public class EqualsTest {

	public static void main(String[] args) {
		
		Member m1 = new Member("test");
		Member m2 = new Member("test");
		String s1 = new String("kor");  //String은 값 자체가 비교되기 때문에 equals 로 바로 비교 가능(주소값x)
		String s2 = new String("kor");
		
		System.out.println("== : " + (m1 == m2));
		System.out.println("equals : " + m1.equals(m2));
		
		System.out.println("== : " + (s1 == s2));
		System.out.println("equals : " + s1.equals(s2));

	}

}
