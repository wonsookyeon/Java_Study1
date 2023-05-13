package ex02;


class Friend{
	private String name;
	private String phone;
	
	public Friend(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "name=" + name + ", phone=" + phone;
	}
	
//	@Override
//	public String toString() {
//		return "Friend [name=" + name + ", phone=" + phone + "]";
//	}
	
	
}

class UnivFriend extends Friend{  //대학동창
	private String major;
	
	
	public UnivFriend(String name, String major, String phone) {
		super(name, phone);
		this.major = major;
	}
	
	@Override
	public String toString() {
		return "UnivFriend [" + super.toString() + ", major=" + major + " ]";
	}
}



class ComFriend extends Friend{   //직장동료
	private String department;
	
	public ComFriend(String name, String department, String phone) {
		super(name, phone);
		this.department =department;
	}

	@Override
	public String toString() {
		return "ComFriend [" + super.toString() + ", department=" + department + " ]";
	}
}




//친구 전화목록 클래스
public class MyFriends {

	public static void main(String[] args) {
		
		Friend[] friends = new Friend[10];
		int fcnt = 0;
		
		friends[fcnt++] = new UnivFriend("kim", "경영", "010-1111-1234");
		friends[fcnt++] = new UnivFriend("park", "컴퓨터", "010-2222-2345");
		friends[fcnt++] = new ComFriend("Lee", "회계", "010-3333-3333");
		friends[fcnt++] = new ComFriend("Hong", "개발", "010-4444-4444");
		
		
		for(int i=0; i<fcnt; i++)
			System.out.println(friends[i]);
		
		
	}
}
		
		
		