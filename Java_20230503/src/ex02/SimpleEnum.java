package ex02;


enum Scale{
	DO, RE, MI, FA
}
public class SimpleEnum {

	public static void main(String[] args) {
		
		System.out.println(Scale.DO.ordinal());
		System.out.println(Scale.DO.name());
		System.out.println(Scale.RE);
		

	}

}
