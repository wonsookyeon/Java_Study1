package ex01;
// 1~100 까지 메모장에 출력

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteNumberFile {

	public static void main(String[] args) throws IOException  {

	
		String path = "c:/data/data.data";
		
		DataOutputStream out = new DataOutputStream( new FileOutputStream(path) );
		
		for(int i=0; i<=100; i++) {
			out.writeInt(i);
		}

//		System.out.println("파일을 정상적으로 저장했습니다.");
	
		
		out.close();
		
	}

}
