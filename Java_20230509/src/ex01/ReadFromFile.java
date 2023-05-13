package ex01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadFromFile {

	public static void main(String[] args) throws IOException {

		String path = "c:/data/data.dat";
		
/*		InputStream input = new FileInputStream(path);
		int data = input.read();
		input.close();
		System.out.printf("%d : %c", data, data); // 아스키코드표의 문자를 찍어줌
*/		

		InputStream input = new FileInputStream(path);
		
		byte[] data = new byte[1024];
		int byteRead = 0; // 읽어 올 글자 수
		String str = null;
		
		while( ( byteRead = input.read(data)) != -1) {
			                                  // 더이상 읽어올 문자가 없을 때
			str = new String(data, 0, byteRead);
			System.out.println("byte : " + byteRead);
		}
		System.out.println(str);
		input.close();
		
		
	}

}
