package ex01;


class UnivFriend{  //대학 동창
	private String name;
	private String major;
	private String phone;
	
	public UnivFriend(String name, String major, String phone) {
		this.name = name;
		this.major = major;
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "UnivFriend [name=" + name + ", major=" + major + ", phone=" + phone + "]";
	}
}



class ComFriend{   //직장동료
	private String name;
	private String major;
	private String phone;
	
	public ComFriend(String name, String major, String phone) {
		this.name = name;
		this.major = major;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "ComFriend [name=" + name + ", major=" + major + ", phone=" + phone + "]";
	}
}




//친구 전화목록 클래스
public class MyFriends {

	public static void main(String[] args) {
		
		//대학동창 관리하는 배열
		UnivFriend[] univFriends = new UnivFriend[5];
		int ucnt = 0;
		
		
		ComFriend[] comFriends = new ComFriend[5];
		int ccnt = 0;
		
		univFriends[ucnt++] = new UnivFriend("kim", "경영", "010-1111-1234");
		univFriends[ucnt++] = new UnivFriend("park", "컴퓨터", "010-2222-2345");
		
		for(int i=0; i<ucnt; i++)
			System.out.println(univFriends[i]);
		
		System.out.println("------------------------------------------------------------");
		
		comFriends[ccnt++] = new ComFriend("Lee", "회계", "010-3333-3333");
		comFriends[ccnt++] = new ComFriend("Hong", "개발", "010-4444-4444");
		
		for(int i=0; i<ccnt; i++)
			System.out.println(comFriends[i]);
		
	}
}
		
		
		