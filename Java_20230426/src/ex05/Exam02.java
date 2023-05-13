package ex05;
//파일 읽어오기, 읽어온 파일 다른파일로 내보내기


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exam02 {

	public static void main(String[] args) throws IOException {
		
		String filePath = "C:/data/sample.txt"; //읽어올 파일 경로
		BufferedReader reader = null;
		
		String file= "C:/data/data.txt";
		BufferedWriter writer = null;
		
		try {
			reader = new BufferedReader(new FileReader(filePath));
			writer = new BufferedWriter(new FileWriter(file));
			String line = null;

			while ((line = reader.readLine()) != null) {
//				System.out.println(line);

				writer.write(line+"\r\n");   // \r\n : 줄바꿈
				
//				writer.write(line);
//				writer.newLine(); // 줄바꿈
//				writer.flush(); // write로 담은 내용 출력 후, 버퍼를 비움
			}
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			reader.close(); // 꼭 닫아줘야 함.
			writer.close();
		}
	}
}