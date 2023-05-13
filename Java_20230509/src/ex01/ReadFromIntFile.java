package ex01;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFromIntFile {

	public static void main(String[] args) throws IOException {
		
		String path = "c:/data/data.dat";
		
		DataInputStream in = new DataInputStream( new FileInputStream(path));
		
		int num = in.readInt();
		double f = in.readDouble();
		System.out.println(num);
		System.out.println(f);
		in.close();
		
		
		
	}

}
