package fileio_ex;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex02 {

	public static void main(String[] args) throws IOException {
		// 파일 읽기
		FileInputStream fis = new FileInputStream("output1.txt"); 
		InputStreamReader isr = new InputStreamReader(fis, "utf-8");
		BufferedReader br = new BufferedReader(isr);
		
		while (true) {
			String readLine = br.readLine();
			if (readLine == null) {
				break;
			}
			
			System.out.println(readLine);
		}
		
		br.close();
	}

}
