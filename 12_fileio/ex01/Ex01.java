package fileio_ex;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		// 파일 쓰기
		
		// 앞에 있는 파라미터: 파일 이름, 경로
		// 뒤에 있는 파라미터: true - 덧붙이기     false - 새로쓰기
		FileOutputStream fileOutputStream = new FileOutputStream("output1.txt", false);
		OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "utf-8");
		BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
		
		String text = "파일에 쓸 내용... \n안녕하세요~~~";
		bufferedWriter.write(text);
		System.out.println("파일 쓰기 완료");
		bufferedWriter.close();
	}

}
