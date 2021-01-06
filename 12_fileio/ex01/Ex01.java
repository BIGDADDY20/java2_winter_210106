package fileio_ex;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Ex01 {

	public static void main(String[] args) throws Exception {
		// 파일 쓰기
		
		// workspace\프로젝트 위치\output1.txt
		FileOutputStream fileOutputStream = new FileOutputStream("output1.txt", false);
		OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "utf-8");
		BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
		
		String text = "안녕하세요.\n제 이름은 신보람입니다.";
		bufferedWriter.write(text);
		bufferedWriter.close();
	}

}
