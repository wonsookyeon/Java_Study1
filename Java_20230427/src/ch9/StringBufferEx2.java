package ch9;
// 자바의 정석 482p

public class StringBufferEx2 {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("01");  // sb = "01"
		StringBuffer sb2 = sb.append(23); // sb2 = sb에 23을 추가, sb2 = "0123", sb = "0123"
		sb.append('4').append(56); // sb에 4를 추가하고, 56을 추가, sb = "0123456"
		
		StringBuffer sb3 = sb.append(78); // sb3 = sb에 78을 추가, sb3 = "012345678", sb = "012345678"
		sb3.append(9.0);
		
		System.out.println("sb = " + sb);
		System.out.println("sb2 = " + sb2);
		System.out.println("sb3 = " + sb3);
		
		System.out.println("sb = " + sb.deleteCharAt(10));
		System.out.println("sb = " + sb.delete(3, 6));
		System.out.println("sb = " + sb.insert(3, "abc"));
		System.out.println("sb = " + sb.replace(6, sb.length(), "END"));

		System.out.println("capacity = " + sb.capacity());
		System.out.println("lenght = " + sb.length());

	}

}
