package ex06;

// close 없을때
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exam01 {

	public static void main(String[] args) throws IOException {
		
		String filePath = "C:/data/sample.txt"; //읽어올 파일 경로
		
		// try() 괄호안에 넣어주면 try문 끝나면 자동으로 닫아준다.
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))){
			String line=null;
			
			while( (line = reader.readLine()) != null) {
				System.out.println(line);
			}
				
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	
	}
	
}